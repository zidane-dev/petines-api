package com.ensak.petines.repositories;

//import com.ensak.petines.model.Pet;
import com.ensak.petines.model.Pets;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PettyRepository extends PagingAndSortingRepository<Pets, Long> {

    List<Pets> findAll();

    Pets findById(Integer id);

    //Pets findByStatus(String status);

}
