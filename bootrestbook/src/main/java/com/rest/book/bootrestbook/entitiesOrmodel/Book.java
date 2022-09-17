package com.rest.book.bootrestbook.entitiesOrmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity    
@Table(name = "books")
public class Book {
   
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private int Id;
    private String bookTitle;

   
    private String author;

    @Column(name = "catagory")
    private String catagory;
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getCatagory() {
        return catagory;
    }
    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
    public Book(int id, String bookTitle, String author, String catagory) {
        Id = id;
        this.bookTitle = bookTitle;
        this.author = author;
        this.catagory = catagory;
    }
    public Book() {
    }
    @Override
    public String toString() {
        return "Book [Author=" + author + ", Catagory=" + catagory + ", Id=" + Id + ", bookTitle=" + bookTitle + "]";
    }
    

}
