package com.example.demo.repositories;


import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {
     List<User> findAll();
     User findById(Integer id);
     User findByUsername(String username);
}
