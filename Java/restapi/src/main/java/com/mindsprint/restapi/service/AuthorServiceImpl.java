package com.mindsprint.restapi.service;

import com.mindsprint.restapi.model.Author;
import com.mindsprint.restapi.repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{
    @Autowired
    AuthorRepo repo;
    @Override
    public Author addAuthor(Author author) {
        return repo.save(author);
    }

    @Override
    public List<Author> getAllAuthors() {
        return  repo.findAll();
    }
}
