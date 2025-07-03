package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // Marks this class as a Spring service component
public class BookService {

    @Autowired  // Inject BookRepository automatically
    private BookRepository bookRepository;

    public void addBook() {
        System.out.println("BookService: Adding a book...");
        bookRepository.saveBook();
    }
}
