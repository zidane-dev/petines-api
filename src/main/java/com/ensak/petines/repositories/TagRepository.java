package com.ensak.petines.repositories;

import com.ensak.petines.model.Tag;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TagRepository extends CrudRepository<Tag, String> {

    List<Tag> findAll();
}
