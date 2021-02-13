package com.ensak.petines.controller;

import com.ensak.petines.model.Commande;
import com.ensak.petines.model.User;
import com.ensak.petines.repositories.CommandeRepository;
import com.ensak.petines.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class CommandeController {

    @Autowired
    CommandeRepository commandeRepository;

    @Autowired
    UserRepository userRepository;



    @RequestMapping("/commandes")
    public List<Commande> getAllCommandes()
    {
        return commandeRepository.findAll();
    }

    @RequestMapping("/commandes/{username}")
    public List<Commande> getCommandesByUser(@PathVariable String username) {
        User user = userRepository.findByUsername(username);
        return commandeRepository.findCommandeByUser(user);
    }

    @RequestMapping(method= RequestMethod.POST, value="/livraison")
    public void addCommande(@RequestBody Commande commande) {
        commandeRepository.save(commande);
    }

}
