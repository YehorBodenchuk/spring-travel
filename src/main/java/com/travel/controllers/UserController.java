package com.travel.controllers;

import com.travel.bom.User;
import com.travel.services.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.users.AbstractUser;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UserController {

    private final UserService userService;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, world!";
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }
}
