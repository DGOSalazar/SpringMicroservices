package com.example.usuarios.userController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usuarios.userEntity.User;
import com.example.usuarios.userRepository.UserRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserRepo userRepo;

    @GetMapping()
    public List<User> UserList() {
        return userRepo.findAll();
    }
    @PostMapping(value="path")
    public SomeEnityData postMethodName(@RequestBody SomeEnityData entity) {
        //TODO: process POST request
        
        return entity;
    }
    
    

}
