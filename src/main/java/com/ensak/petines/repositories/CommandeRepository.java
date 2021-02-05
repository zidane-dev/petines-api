package com.ensak.petines.repositories;

import com.ensak.petines.model.Commande;
import com.ensak.petines.model.Pets;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CommandeRepository extends PagingAndSortingRepository<Commande, Long> {

    List<Commande> findAll();

   // List<Commande> findCommandeByUser_id();
}
