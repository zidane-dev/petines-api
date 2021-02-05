package com.ensak.petines.controller;

import com.ensak.petines.model.Commande;
import com.ensak.petines.model.Pets;
import com.ensak.petines.model.User;
import com.ensak.petines.repositories.CommandeRepository;
import com.ensak.petines.repositories.PettyRepository;
import com.ensak.petines.services.CommandeService;
import com.ensak.petines.services.PettyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
public class CommandeController {

    @Autowired
    CommandeRepository commandeRepository;


    @Autowired
    CommandeService commandeService;



    @RequestMapping("/commandes")
    public List<Commande> getAllCommandes()
    {
        return commandeRepository.findAll();
    }


}
