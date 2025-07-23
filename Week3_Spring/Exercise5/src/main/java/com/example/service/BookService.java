package com.example.service;

import com.example.repository.BookRepository;
import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for Spring XML injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<String> getAllBooks() {
        return bookRepository.findAll();
    }

    public void addBook(String title) {
        bookRepository.addBook(title);
    }
}
