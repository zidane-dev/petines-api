package com.example.demo.repositories;

import com.example.demo.model.Tag;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TagRepository extends CrudRepository<Tag, String> {

    List<Tag> findAll();
}
