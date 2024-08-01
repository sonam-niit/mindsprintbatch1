package com.mindsprint.restapi.service;

import com.mindsprint.restapi.model.Book;

import java.util.List;

public interface BookService {
    public Book addBook(Book book);
    public List<Book> getAllBooks();
}
