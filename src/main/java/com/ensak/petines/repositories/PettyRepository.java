package com.ensak.petines.repositories;
import com.ensak.petines.model.Pets;
import com.ensak.petines.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PettyRepository extends CrudRepository<Pets, String> {

    List<Pets> findAll();

    Pets findById(int id);

    List<Pets> findByUser(User u);

}
