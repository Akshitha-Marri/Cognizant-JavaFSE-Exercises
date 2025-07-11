package com.library;

public class BookRepository {
    public Book findBookById(int id) {
        return new Book(id, "Spring Framework");
    }
}
