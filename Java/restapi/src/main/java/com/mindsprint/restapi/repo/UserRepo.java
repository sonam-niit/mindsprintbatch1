package com.mindsprint.restapi.repo;

import com.mindsprint.restapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
