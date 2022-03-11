package com.example.springsecurityexample.api.controller;

import com.example.springsecurityexample.api.model.User;
import com.example.springsecurityexample.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")

public class AdminController {

    @Autowired
    UserService userService;


    @GetMapping("user/all")
    public ResponseEntity<?> getUsers(){
        return ResponseEntity.ok().body(userService.getAllUsers());
    }


    @PostMapping("user/add")
    public ResponseEntity<?> addUserByAdmin(@RequestBody User user){
        return ResponseEntity.ok().body(userService.addUser(user));
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @PutMapping("user/update")
    public ResponseEntity<?> updateUser(@RequestBody User user){
        return ResponseEntity.ok().body(userService.updateUser(user));
    }

}
