package com.ensak.petines.services;

import com.ensak.petines.model.Commande;
import com.ensak.petines.model.User;
import com.ensak.petines.repositories.CommandeRepository;
import com.ensak.petines.repositories.PetRepository;
import com.ensak.petines.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {

    @Autowired
    CommandeRepository commandeRepository;
    @Autowired
    PetRepository petRepository;

    @Autowired
    UserRepository userRepository;



    public List<Commande> getAllCommandes() {

        return commandeRepository.findAll();
    }
    public List<Commande> getCommandesByUser(User user) {

        return   commandeRepository.findCommandesByUser(user);
    }

}