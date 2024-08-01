package com.mindsprint.restapi;

import com.mindsprint.restapi.model.Author;
import com.mindsprint.restapi.model.Book;
import com.mindsprint.restapi.service.AuthorService;
import com.mindsprint.restapi.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class BookTest {

    @Autowired
    BookService bookService;
    @Autowired
    AuthorService authorService;

    @Test
    public void addBook(){
        Book book = new Book();
        book.setTitle("book3");
        Author author= new Author();
        author.setId((long )1);
        book.setAuthor(author);
        Assertions.assertNotNull(bookService.addBook(book));
    }
    @Test
    public void addAuthor(){
        Author author= new Author();
        author.setName("Sonam Soni");
        Assertions.assertNotNull(authorService.addAuthor(author));
    }

}
