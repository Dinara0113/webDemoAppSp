package com.demo.WebDemoApplication.services;

import com.demo.WebDemoApplication.model.Book;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;

@Service
public class BookService {
    private final HashMap<Long, Book> books = new HashMap<>();
    private long lastId = 0;

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
