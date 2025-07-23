package com.library.service;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<String> books = new ArrayList<>();

    public BookService() {
        books.add("Spring in Action");
        books.add("Effective Java");
    }

    public List<String> getBooks() {
        return books;
    }

    public void addBook(String book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }
}
