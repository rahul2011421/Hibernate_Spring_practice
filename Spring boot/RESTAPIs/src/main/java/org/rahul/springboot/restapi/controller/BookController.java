package org.rahul.springboot.restapi.controller;

import org.rahul.springboot.restapi.entities.Book;
import org.rahul.springboot.restapi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

//@Controller
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    //@RequestMapping(value = "/books", method = RequestMethod.GET)
    //@ResponseBody
    @GetMapping("/books")
    public List<Book> book(){
        return this.bookService.getAllBooks();
    }
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id){
        return this.bookService.getBookById(id);
    }
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        Book b=this.bookService.addBook(book);
        return b;
    }
    @DeleteMapping("/books/{book_id}")
    public void deleteById(@PathVariable("book_id") int id){
        System.out.println("deleted");
        this.bookService.deleteById(id);
    }
    @PutMapping("/books/{id}")
    public Book updateBook(@RequestBody Book book,@PathVariable int id){
       this.bookService.updateBook(book,id);
        return book;
    }
}
