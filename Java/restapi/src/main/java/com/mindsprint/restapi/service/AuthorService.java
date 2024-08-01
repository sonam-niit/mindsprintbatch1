package com.mindsprint.restapi.service;

import com.mindsprint.restapi.model.Author;

import java.util.List;

public interface AuthorService {
    public Author addAuthor(Author author);
    public List<Author> getAllAuthors();
}
