package com.hackerspace.sknera.controller;

import com.hackerspace.sknera.model.User;
import com.hackerspace.sknera.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/list")
public class IndexController {

    private UserService userService;

    @Autowired
    IndexController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> listAll(@RequestParam(name = "name", required = false) String name) {
        List<User> list = userService.getAll(name);
        return ResponseEntity.ok(list);
    }

    @PostMapping("/{userId}")
    public ResponseEntity<User> createUser (@PathVariable("userId") String userId)
    {
        User createdUser = userService.createUser();
        return ResponseEntity.ok(createdUser);
    }

}
