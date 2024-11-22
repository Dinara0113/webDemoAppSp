package com.demo.WebDemoApplication.services;

import com.demo.WebDemoApplication.model.Book;
import com.demo.WebDemoApplication.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book) {
        book.setId(++lastId);
        books.put(lastId, book);
        return book;
    }

    public Book findBook(long lastId) {
        return books.get(lastId);
    }

    public Book editBook(Book book) {
        if (books.containsKey(book.getId())) {
            books.put(book.getId(), book);
            return book;
        }
        return null;
    }

    public Book deleteBook(long id) {
        return books.remove(id);
    }

    public Collection<Book> getAllBooks() {
        return books.values();
    }
}
