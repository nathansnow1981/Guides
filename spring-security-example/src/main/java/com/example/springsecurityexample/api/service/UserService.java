package com.example.springsecurityexample.api.service;

import com.example.springsecurityexample.api.model.User;
import com.example.springsecurityexample.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    public String encode(String pwd){
        return passwordEncoder.encode(pwd);
    }

    public User addUser(User user){
        String password = user.getPassword();
        String encryptedPassword = passwordEncoder.encode(password);
        user.setPassword(encryptedPassword);
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Object updateUser(User user){
        if(userRepository.existsById(user.getUserId()))
            return userRepository.save(user);
        else return "User not found";
    }
}
