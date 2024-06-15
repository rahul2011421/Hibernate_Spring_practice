package org.rahul.springboot.restapi.services;

import org.rahul.springboot.restapi.entities.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    private static List<Book> list=new ArrayList<>();
    static {
        list.add(new Book(101,"roadmap to java","XYZ"));
        list.add(new Book(102,"roadmap to system design","ABC"));
        list.add(new Book(103,"roadmap to spring boot","LMN"));
    }
    public List<Book> getAllBooks(){
        return list;
    }
    public Book getBookById(int id){
        Book book;
        book=list.stream().filter(e->e.getB_id()==id).findFirst().get();
        return book;
    }
    public Book addBook(Book book){
        list.add(book);
        return book;
    }
    public void deleteById(int id){
        list=list.stream().filter(e->e.getB_id()!=id).collect(Collectors.toList());
    }
    public void updateBook(Book book,int id){
        list=list.stream().map(b->{
            if(b.getB_id()==id){
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
            }
            return b;
        }).collect(Collectors.toList());
    }
}
