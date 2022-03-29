package com.example.implementingaop.controller;

import com.example.implementingaop.model.User;
import com.example.implementingaop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/got")
    public User add(){
        return userService.createUser();
    }
}
