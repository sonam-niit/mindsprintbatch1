package com.mindsprint.restapi.controllers;

import com.mindsprint.restapi.model.Book;
import com.mindsprint.restapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class BookController {
    @Autowired
    BookService service;

    @PostMapping
    public ResponseEntity<Object> createBook(@RequestBody Book book){
        Book newBook= service.addBook(book);
        return new ResponseEntity<>("Book Created", HttpStatus.CREATED);
    }
}
