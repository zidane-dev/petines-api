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

        Pets mPetty = pettyRepository.findById(Id).orElse(null);

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

        Pets mPetty = pettyRepository.findById(Id).orElse(null);
        /*
        code delete pet from database
         */
    }

    public List<Pets> getPetsByUser(User u) {
        return pettyRepository.findByUser(u);
    }

    public Pets getPettyById(int id) {
        return pettyRepository.findById(id).orElse(null);
    }

    public Pets addPet(Pets pets, User u) {
        /*
        Pets pet1 = new Pets();
        //pet1.setId(99);
        pet1.setName("pets.getName()");
        //pet1.setLove(pets.getLove());
        pet1.setBirth("2020-01-01");
        pet1.setBreed("pets.getBreed()");
        pet1.setDescription("pets.getDescription()");
        pet1.setGender(pets.getGender());
        pet1.setSpecies(pets.getSpecies());
        User u1 = userRepository.findById(1).orElse(null);
        pet1.setUser(u1);
        pettyRepository.save(pet1);
        return pet1;

         */

        Pets pet1 = new Pets();
        pet1.setId(99);
        pet1.setName(pets.getName());
        //pet1.setLove(pets.getLove());
        pet1.setBirth("2020-01-01");
        pet1.setBreed(pets.getBreed());
        pet1.setDescription(pets.getDescription());
        pet1.setGender(pets.getGender());
        pet1.setSpecies(pets.getSpecies());
        pet1.setLove("false");
        //pet1.setPicture(pets.getPicture());
        //User u1 = userRepository.findById(1).orElse(null);
        //User u1 = userRepository.findByUsername(username);
        pet1.setUser(u);
        pettyRepository.save(pet1);
        return pet1;
    }
}