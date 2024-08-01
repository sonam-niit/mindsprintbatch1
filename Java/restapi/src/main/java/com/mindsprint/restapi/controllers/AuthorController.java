package com.mindsprint.restapi.controllers;

import com.mindsprint.restapi.model.Author;
import com.mindsprint.restapi.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/author")
public class AuthorController {
    @Autowired
    AuthorService service;

    @PostMapping
    public ResponseEntity<Object> createAuthor(@RequestBody Author author){
        Author newAuthor= service.addAuthor(author);
        return new ResponseEntity<>("Author Created", HttpStatus.CREATED);
    }
}
