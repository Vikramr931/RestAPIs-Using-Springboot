package com.rest.book.bootrestbook.daoRepository;

import org.springframework.data.repository.CrudRepository;

import com.rest.book.bootrestbook.entitiesOrmodel.Book;

public interface BookRepository extends CrudRepository<Book,Integer> {
        public Book findById(int id);   

        
}
 