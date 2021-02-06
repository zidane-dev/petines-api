package com.ensak.petines.repositories;

import com.ensak.petines.model.Commande;
import com.ensak.petines.model.Pets;
import com.ensak.petines.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommandeRepository extends PagingAndSortingRepository<Commande, Long> {

    List<Commande> findAll();


    List<Commande> findCommandesByUser(User user);


    /*@Query("SELECT c from Commande c WHERE  c.user.id=:#{#user.id}")
    List<Commande> findCommandesByUser(@Param("user") User user);*/
}
