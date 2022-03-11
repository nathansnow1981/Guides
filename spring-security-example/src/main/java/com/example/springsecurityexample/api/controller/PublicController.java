package com.example.springsecurityexample.api.controller;

import com.example.springsecurityexample.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("public")
public class PublicController {

    @Autowired
    UserService userService;

    @GetMapping("greeting")
    String greeting(){
        return "Hello public controller";
    }

    @PostMapping("encode/{pwd}")
    String encode(@PathVariable String pwd){
        return userService.encode(pwd);
    }

}
