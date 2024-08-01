package com.mindsprint.restapi.service;

import com.mindsprint.restapi.model.Book;
import com.mindsprint.restapi.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    BookRepo repo;
    @Override
    public Book addBook(Book book) {
        return repo.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return repo.findAll();
    }
}
