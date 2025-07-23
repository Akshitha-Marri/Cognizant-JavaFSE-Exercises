package com.example.repository;

import java.util.*;

public class BookRepository {
    private final List<String> books = new ArrayList<>(List.of("Spring in Action", "Effective Java"));

    public List<String> findAll() {
        return Collections.unmodifiableList(books);
    }

    public void addBook(String title) {
        books.add(title);
    }
}
