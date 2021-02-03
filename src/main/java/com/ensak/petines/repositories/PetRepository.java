package com.ensak.petines.repositories;

import com.ensak.petines.model.Pet;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PetRepository extends PagingAndSortingRepository<Pet, Long> {
/*
    List<Pet> findAll();
    Pet findByPid(Integer pid);
    Pet findByStatus(String status);

 */

}
