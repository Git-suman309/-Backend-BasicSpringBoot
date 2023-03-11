package com.Test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody  User user){  //when u need complect obj as input use @Req body
    return userService.addUser(user);
    }
    @GetMapping("/get_Users")
    public List<User> getUser(){ // get all the user in db
        return userService.getUser();
    }

    @GetMapping("/get_User")
    public User getUser(@RequestParam("id") int id){ // get by id/pk
        return userService.getUser(id);
    }

    // delete by a roll no

    // delete all the users

    // update a user by id


}
