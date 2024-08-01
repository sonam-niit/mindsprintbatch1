package com.mindsprint.restapi.repo;

import com.mindsprint.restapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}
