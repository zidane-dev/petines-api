package com.ensak.petines.repositories;
import com.ensak.petines.model.Pets;
import com.ensak.petines.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PettyRepository extends CrudRepository<Pets, Integer> {

    List<Pets> findAll();

    Optional<Pets> findById(int id);

    List<Pets> findByUser(User u);

}
