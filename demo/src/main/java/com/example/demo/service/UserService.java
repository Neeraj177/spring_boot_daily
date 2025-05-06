package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    public User create(User user );
    List<User> getAllUser();
    User deleteUser(int id );
    User updateUser(int id ,User user);
}
