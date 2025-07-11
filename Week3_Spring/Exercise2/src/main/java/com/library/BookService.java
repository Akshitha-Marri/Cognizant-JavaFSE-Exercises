package com.library;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook(int id) {
        Book book = bookRepository.findBookById(id);
        book.display();
    }
}
