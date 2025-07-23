package com.library;

import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    public void addBook(String bookName) {
        System.out.println("Book added: " + bookName);
    }
}
