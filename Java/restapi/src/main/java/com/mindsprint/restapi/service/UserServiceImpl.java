package com.mindsprint.restapi.service;

import com.mindsprint.restapi.model.User;
import com.mindsprint.restapi.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepo repo;
    @Override
    public User addUser(User user) {
        return repo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public User getUserById(Long id) {
        if(repo.findById(id).isPresent()){
            return repo.findById(id).get();
        }else
            return null;
        //return repo.findById(id).orElse(null);
    }

    @Override
    public User updateUser(User user, Long id) {
        if(repo.findById(id).isPresent()){
           User oldUser= repo.findById(id).get();
           oldUser.setCountry(user.getCountry());
           oldUser.setName(user.getName());
           return repo.save(oldUser);
        }else
            return null;
    }

    @Override
    public boolean deleteUserById(Long id) {
        if(repo.findById(id).isPresent()){
            repo.deleteById(id);
            return true;
        }else
            return false;
    }
}
