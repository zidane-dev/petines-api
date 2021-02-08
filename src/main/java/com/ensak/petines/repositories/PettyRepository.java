package com.ensak.petines.repositories;
import com.ensak.petines.model.Pets;
import com.ensak.petines.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PettyRepository extends CrudRepository<Pets, Integer> {

    List<Pets> findAll();

    Pets findById(int id);

    List<Pets> findByUser(User u);

}
