package com.mindsprint.firstapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @RequestMapping("/hello")
    public String getData(){
        return "Hello From Springboot";
    }
    @RequestMapping("/user")
    public User getUser(){
        return  new User(1,"Sonam");
    }
    @RequestMapping("/users")
    public List<User> getAllUser(){
        List<User> list= new ArrayList<>();
        list.add(new User(1,"alex"));
        list.add(new User(2,"john"));
        list.add(new User(3,"jack"));
        return  list;
    }
}
