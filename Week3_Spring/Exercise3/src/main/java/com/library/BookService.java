package com.library.service;

import org.springframework.stereotype.Component;

@Component
public class BookService {

    public void addBook() throws InterruptedException {
        Thread.sleep(300);
        System.out.println("Book added.");
    }

    public void removeBook() throws InterruptedException {
        Thread.sleep(200);
        System.out.println("Book removed.");
    }
}
