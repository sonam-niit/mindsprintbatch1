package com.mindsprint.restapi.controllers;

import com.mindsprint.restapi.model.User;
import com.mindsprint.restapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService service;
    @PostMapping
    public ResponseEntity<Object> addUser(@RequestBody User user){
        if(user.getEmail()==null){
            return new ResponseEntity<>("Email field is mandatory",
                    HttpStatus.BAD_REQUEST);
        }
        User resp= service.addUser(user);
        return new ResponseEntity<>(resp, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> list= service.getAllUsers();
        return  new ResponseEntity<>(list,HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<Object> getUserById(@PathVariable Long id){
        User found= service.getUserById(id);
        if(found==null){
            return  new ResponseEntity<>("No User Found",HttpStatus.NOT_FOUND);
        }
        return  new ResponseEntity<>(found,HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Object> updateUserById(@PathVariable Long id,
                                                 @RequestBody User user){
        User updated= service.updateUser(user,id);
        if(updated==null){
            return  new ResponseEntity<>("No User Found to update",HttpStatus.NOT_FOUND);
        }
        return  new ResponseEntity<>(updated,HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable Long id){
        if(service.deleteUserById(id))
            return new ResponseEntity<>("User Deleted Successfully",HttpStatus.OK);
        return new ResponseEntity<>("No User found to deleted",HttpStatus.NOT_FOUND);
    }

}
