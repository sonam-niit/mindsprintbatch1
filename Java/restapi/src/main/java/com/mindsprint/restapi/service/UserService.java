package com.mindsprint.restapi.service;

import com.mindsprint.restapi.model.User;

import java.util.List;

public interface UserService {
    public User addUser(User user);
    public List<User> getAllUsers();
    public User getUserById(Long id);
    public User updateUser(User user,Long id);
    public boolean deleteUserById(Long id);
}
