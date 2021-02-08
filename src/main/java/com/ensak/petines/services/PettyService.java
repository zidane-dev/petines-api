package com.ensak.petines.services;

import com.ensak.petines.model.OrderItem;
import com.ensak.petines.model.Pets;
import com.ensak.petines.model.User;
import com.ensak.petines.repositories.PettyRepository;
import com.ensak.petines.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PettyService {

    @Autowired
    PettyRepository pettyRepository;

    @Autowired
    UserRepository userRepository;


    public void updatePetty(int Id, Pets petty ) {

        Pets mPetty = pettyRepository.findById(Id);

        mPetty.setName(petty.getName());
        mPetty.setSpecies(petty.getSpecies());
        mPetty.setBreed(petty.getBreed());
        mPetty.setGender(petty.getGender());
        mPetty.setBirth(petty.getBirth());
        mPetty.setPicture(petty.getPicture());
        mPetty.setLove(petty.getLove());

        pettyRepository.save(mPetty);
    }

    public void deletePetty(int Id) {

        Pets mPetty = pettyRepository.findById(Id);
        /*
        code delete pet from database
         */
    }

    public List<Pets> getPetsByUser(User u) {
        return pettyRepository.findByUser(u);
    }
}