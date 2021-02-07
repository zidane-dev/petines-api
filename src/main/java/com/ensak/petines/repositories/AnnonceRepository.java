package com.ensak.petines.repositories;

import com.ensak.petines.model.Annonce;
import com.ensak.petines.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnnonceRepository extends CrudRepository<Annonce, String> {
    List<Annonce> findAll();
    Annonce findById(Integer id);
    Annonce findAnnonceByUser(User userame);
}
