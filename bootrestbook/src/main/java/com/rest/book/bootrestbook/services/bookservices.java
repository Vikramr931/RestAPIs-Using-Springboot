package com.rest.book.bootrestbook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rest.book.bootrestbook.daoRepository.BookRepository;
import com.rest.book.bootrestbook.entitiesOrmodel.Book;
@Component
public class bookservices {
    @Autowired
    private BookRepository bookRepository;
    
    // private static List<Book> list=new ArrayList<>();
        
    //     static{
    //         list.add(new Book(12,"Vikas","Physics","Science"));
    //         list.add(new Book(13,"Sam","RedHAt","Hack"));
    //         list.add(new Book(14,"Raoy","Hindi","Lang"));
    //         list.add(new Book(15,"May","saras","mazegine"));
    //     }
       
    
    public List<Book> getAllBooks(){ 
        List<Book> list= ( List<Book>)this.bookRepository.findAll();
        return list;
    }
    
    // get all books

        // public List<Book> getAllBooks(){ 
            
        //     return list;
        // }

            
        public Book getBookById(int Id){
            Book book=null;
            //book=list.stream().filter(e-> e.getId()==Id).findFirst().get();
            book= this.bookRepository.findById(Id);
            
            return book ;
        }


      //  get book by id
        // public Book getBookById(int Id){
        //     Book book=null;
        //     book=list.stream().filter(e-> e.getId()==Id).findFirst().get();
        //     return book ;
        // }


        public Book addBook(Book book){
            Book result=bookRepository.save(book);
        return result;
    }

        //adding new book
        // public Book addBook(Book book){
        //         list.add(book);
        //     return book;
        // }
        
        public  void deleteBook(int Bid){
            this.bookRepository.deleteById(Bid);
        }

        //delete book
        // public  void deleteBook(int Bid){
        //     list= list.stream().filter(book ->{
        //         if(book.getId()!=Bid){
        //             return true;
        //         }else{
        //             return false;
        //         }
        //     }).collect(Collectors.toList());
        // }

        public void updateBook(Book book, int Id){
                book.setId(Id);
                bookRepository.save(book);
        }

           //update book
            // public void updateBook(Book book, int Id){
            //     list=list.stream().map(b->{
            //     if(b.getId()==Id){
            //         b.setAuthor(book.getAuthor());
            //         b.setBookTitle(book.getBookTitle());
            //     }
            //     return b;
            // }).collect(Collectors.toList());
                
            // }

    }
    
