package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.serviceimpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;
    @GetMapping("/login")
    String login()
    {
        return "neeraj";
    }

    @PostMapping("/createUser")
    String createUser(@RequestBody User user)
    {
        userServiceImpl.create(user);
        return user.toString();
    }

    @PutMapping("/updateUser/{id}")
    void updateUser(@PathVariable int id ,@RequestBody User user)
    {
    userServiceImpl.updateUser(id,user);
    }

    @DeleteMapping("/deleteUse/{id}")
    User delete(@PathVariable int id ){
        return userServiceImpl.deleteUser(id);
    }
    List<User> getAllUser()
    {
        return userServiceImpl.getAllUser();
    }

}
