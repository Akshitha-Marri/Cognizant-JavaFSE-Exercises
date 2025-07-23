package com.library;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<String> books = new ArrayList<>();

    public BookRepository() {
        books.add("Spring in Action");
        books.add("Effective Java");
    }

    public List<String> getBooks() {
        return books;
    }

    public void addBook(String book) {
        books.add(book);
    }
}
