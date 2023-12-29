package com.asparagus.MixLearn.controller;

import com.asparagus.MixLearn.exception.UserNotFoundException;
import com.asparagus.MixLearn.model.User;
import com.asparagus.MixLearn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173/")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userService.save(newUser);
    }

    @GetMapping("/user/{id}")
    User userById (@PathVariable Long id){
        return userService.findOne(id).orElseThrow(()->new UserNotFoundException(id));
    }

    @GetMapping("/users")
    List<User> userList (){
        return userService.findAll();
    }

    @PostMapping("/user/{id}")
    User editUserById(@RequestBody User user){
        // TODO: 04.12.2023  сделать сохранение настроек в базе при применении новых настроек в профиле пользователя
        //
        return user;
    }

}
