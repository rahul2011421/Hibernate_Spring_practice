package org.rahul.springboot.restapi.entities;

public class Book {
    private int b_id;
    private String title;
    private String author;

    public Book(){

    }

    public Book(int b_id, String title, String author) {
        this.b_id = b_id;
        this.title = title;
        this.author = author;
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "b_id=" + b_id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
