package com.ensak.petines.services;

import com.ensak.petines.repositories.UserRepository;
import com.ensak.petines.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {

        return userRepository.findAll();
    }


    public User getUserByUsername(String username) {

        return   userRepository.findByUsername(username);
    }


}
