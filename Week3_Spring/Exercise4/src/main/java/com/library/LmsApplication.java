package com.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LmsApplication implements CommandLineRunner {

    @Autowired
    private LibraryService libraryService;

    public static void main(String[] args) {
        SpringApplication.run(LmsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        libraryService.addBook("Spring in Action");
    }
}
