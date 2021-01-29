package com.example.demo.services;

import com.example.demo.model.User;
import com.example.demo.repositories.PetRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    PetRepository petRepository;


    public List<User> getAllUsers() {

        return userRepository.findAll();
    }


    public User getUserByUsername(String username) {

        return   userRepository.findByUsername(username);
    }


}
