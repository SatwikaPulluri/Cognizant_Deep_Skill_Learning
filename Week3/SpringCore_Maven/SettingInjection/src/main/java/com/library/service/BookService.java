package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private String serviceId; // Inject via constructor
    private BookRepository bookRepository; // Inject via setter

    // Constructor injection
    public BookService(String serviceId) {
        this.serviceId = serviceId;
    }

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        System.out.println("BookService [" + serviceId + "]: Adding a book...");
        bookRepository.saveBook();
    }
}
