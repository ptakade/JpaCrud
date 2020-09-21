package com.springjpa.sprngjpademo.controller;

import com.springjpa.sprngjpademo.model.User;
import com.springjpa.sprngjpademo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @PostMapping(value="/save")
    public String saveUser(@RequestBody User user){
        userRepository.save(user);
        return "User Saved";
    }
    @GetMapping(value="/getList")
    public List<User> getUserList(){
        return userRepository.findAll();
    }

    @GetMapping(value="/getuser/{id}")
    public Optional<User> getUser(@PathVariable Integer id){
        return userRepository.findById(id);
    }

    @DeleteMapping(value="/delete/{id}")
    public String deleteuser(@PathVariable Integer id){
        userRepository.deleteById(id);
        return "User Deleted";
    }

}
