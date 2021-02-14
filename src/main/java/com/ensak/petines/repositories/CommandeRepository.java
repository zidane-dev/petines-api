package com.ensak.petines.repositories;

import com.ensak.petines.model.Commande;
import com.ensak.petines.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommandeRepository extends CrudRepository<Commande, Integer> {

    List<Commande> findAll();


    List<Commande> findCommandeByUser(User user);

}
