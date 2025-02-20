package com.example.crud_service.controller;

import com.example.crud_service.entity.User;
import com.example.crud_service.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/hi")
    public String getHello() {
        return "Hi Rafat";
    }

    @GetMapping("/user-list")
    public List<User> getUserList() {
        return userRepo.findAll();
    }


    @PostMapping("/user-save")
    public void saveUser(@RequestBody User user) {
        userRepo.save(user);
    }

}
