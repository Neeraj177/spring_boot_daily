package com.example.demo.serviceimpl;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    List<User> al = new ArrayList<>();


    @Override
    public User create(User user) {
        al.add(user);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        return al;
    }

    @Override
    public User deleteUser(int id) {
        for(User u : al)
        {
            if(id==u.getId())
            {
                al.remove(u);
                return u;
            }
        }
        return null;
    }

    @Override
    public User updateUser(int id ,User user) {
        for(User u : al)
        {
            if(id==u.getId())
            {
                u.setName(user.getName());
                u.setPassword(user.getPassword());
                return u;
            }
        }
        return null;
    }
}
