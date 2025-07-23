package com.library;

public class BookService {
    private String serviceName;
    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("[" + serviceName + "] Books: " + bookRepository.getBooks());
    }

    public void addBook(String book) {
        bookRepository.addBook(book);
    }
}
