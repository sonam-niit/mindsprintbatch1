package com.mindsprint.restapi.repo;

import com.mindsprint.restapi.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {
}
