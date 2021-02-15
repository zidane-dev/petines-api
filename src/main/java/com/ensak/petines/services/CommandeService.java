package com.ensak.petines.services;

import com.ensak.petines.model.Commande;
import com.ensak.petines.model.Pets;
import com.ensak.petines.model.User;
import com.ensak.petines.repositories.CommandeRepository;
import com.ensak.petines.repositories.PettyRepository;
import com.ensak.petines.repositories.UserRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.activation.CommandMap;
import java.util.List;

@Service
public class CommandeService {


    @Autowired
    CommandeRepository commandeRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    PettyRepository pettyRepository;



    public List<Commande> getAllCommandes() {

        return commandeRepository.findAll();
    }
    public List<Commande> getCommandesByUser(User user) {

        return   commandeRepository.findCommandeByUser(user);
    }

    public Commande addCommande( User user, Commande commande)
    {
        Commande c = new Commande();
        c.setUser(user);
        c.setPet(commande.getPet());
        c.setDate(commande.getDate());
        c.setLocation(commande.getLocation());
        c.setStatus(commande.getStatus());

        commandeRepository.save(c);
        return c;


    }

}
