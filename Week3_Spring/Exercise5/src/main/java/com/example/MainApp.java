package com.example;

import com.example.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        System.out.println("Books before adding: " + bookService.getAllBooks());

        bookService.addBook("Clean Code");

        System.out.println("Books after adding: " + bookService.getAllBooks());

        context.close();
    }
}
