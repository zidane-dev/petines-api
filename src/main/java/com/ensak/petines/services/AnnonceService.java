package com.ensak.petines.services;

import com.ensak.petines.model.Annonce;
import com.ensak.petines.model.User;
import com.ensak.petines.repositories.AnnonceRepository;
import com.ensak.petines.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnonceService {

    @Autowired
    private AnnonceRepository annonceRepository;


    @Autowired
    UserRepository userRepository;

    public List<Annonce> getAllAnnonces() {

        return annonceRepository.findAll();
    }

    public Annonce getAnnoncesByUsername(User username) {

        return   annonceRepository.findAnnonceByUser(username);
    }
}
