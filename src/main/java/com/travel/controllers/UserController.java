package com.travel.controllers;

import com.travel.bom.User;
import com.travel.services.UserService;
import lombok.RequiredArgsConstructor;
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

    @GetMapping("/{userId}")
    public User getById(@PathVariable String userId) {
        return userService.get(userId);
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/auth")
    public User auth(@RequestBody User user) {
        return userService.auth(user);
    }
}
