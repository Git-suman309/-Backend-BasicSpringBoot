package com.Test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    userRepository userRepository;
    public String addUser(User user) {
        userRepository.save(user); //save method implimented in hibernet framework
        return "User added";
    }
    public List<User> getUser() {
        return userRepository.findAll(); // show all the user in db
    }
    public User getUser(int id) {
        return userRepository.findById(id).get(); //get--?
    }
}
