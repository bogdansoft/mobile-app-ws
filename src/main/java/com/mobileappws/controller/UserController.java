package com.mobileappws.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping
    public String getAllUsers() {
        return "Hello there".hashCode() + "";
    }

    @GetMapping("/{userId}")
    public String getUserById(@PathVariable String userId) {
        return "Hello there".hashCode() + "";
    }

    @PostMapping("/post")
    public String postMapping() {
        return "Post there";
    }

    @DeleteMapping("/del")
    public String deleteMapping() {
        return "Deldte there";
    }
}
