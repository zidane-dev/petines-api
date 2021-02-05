package com.ensak.petines.services;

import com.ensak.petines.model.Commande;
import com.ensak.petines.repositories.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {

    @Autowired
    CommandeRepository commandeRepository;

    public List<Commande> getAllCommandes() {

        return commandeRepository.findAll();
    }

}
