package com.ngxspring.starter.controller;

import com.ngxspring.starter.models.User;
import com.ngxspring.starter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String hello() {
        return "Hello, World!";
    }

    @RequestMapping("/{name}")
    public User getByName(@PathVariable String name) {
        return userService.getUser(name);
    }

    @RequestMapping("/add")
    public User addUser(@RequestParam String name,
                        @RequestParam(required = false) String email,
                        @RequestParam(required = true) String userName,
                        @RequestParam(required = true) String password) {
        return userService.addUser(name, email, userName, password);
    }

}
