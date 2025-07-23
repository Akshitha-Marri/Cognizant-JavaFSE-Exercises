package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean(BookService.class);

        System.out.println("Books before adding: " + bookService.getBooks());

        bookService.addBook("Clean Code");

        System.out.println("Books after adding: " + bookService.getBooks());
    }
}
