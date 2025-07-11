package com.library;

public class Book {
    private int id;
    private String title;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void display() {
        System.out.println("Book ID: " + id + ", Title: " + title);
    }
}
