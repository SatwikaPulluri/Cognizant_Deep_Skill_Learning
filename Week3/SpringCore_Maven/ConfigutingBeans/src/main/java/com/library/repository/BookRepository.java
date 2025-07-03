package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository // Marks this class as a Spring repository component
public class BookRepository {

    public void saveBook() {
        System.out.println("BookRepository: Book saved to database.");
    }
}
