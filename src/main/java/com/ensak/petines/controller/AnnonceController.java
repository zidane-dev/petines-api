package com.ensak.petines.controller;

import com.ensak.petines.model.Annonce;
import com.ensak.petines.model.User;
import com.ensak.petines.repositories.AnnonceRepository;
import com.ensak.petines.repositories.UserRepository;
import com.ensak.petines.services.AnnonceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class AnnonceController {

    @Autowired
    AnnonceRepository annonceRepository;

    @Autowired
    UserRepository userRepo;

    @Autowired
    AnnonceService annonceService;

    @RequestMapping("/annonces")
    public List<Annonce> getAllAnnonces(){ return annonceService.getAllAnnonces(); }

    @RequestMapping("/annonces/{username}")
    public List<Annonce> getAnnoncesByUser(@PathVariable String username) {
        User user = userRepo.findByUsername(username);
        return (List<Annonce>) annonceRepository.findAnnonceByUser(user);
    }


}
