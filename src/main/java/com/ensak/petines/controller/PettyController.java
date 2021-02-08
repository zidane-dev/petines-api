package com.ensak.petines.controller;

import com.ensak.petines.model.Pets;
import com.ensak.petines.model.User;
import com.ensak.petines.repositories.PettyRepository;
import com.ensak.petines.services.PettyService;
import com.ensak.petines.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PettyController {
    @Autowired
    PettyRepository pettyRepository;

    @Autowired
    PettyService pettyService;

    @Autowired
    UserService userService;

    @RequestMapping(method= RequestMethod.GET, value="/petties")
    public List<Pets> getAllPets()    {
        return pettyRepository.findAll();
    }

    @RequestMapping (method = RequestMethod.POST, value = "/petties")
    public void addPetty(@RequestBody Pets pets) {
        pettyRepository.save(pets);
    }

    @PostMapping("/petties/{Id}")
    public void updatePetty(@PathVariable int Id, @RequestBody Pets petty ) {
        pettyService.updatePetty(Id, petty);
    }

    @DeleteMapping("/petties/delete/{Id}")
    public void deletePetty(@PathVariable int Id) {
        pettyService.deletePetty(Id);
    }

    @PostMapping("/petties/updateLove/{Id}")
    public Pets updateLovePetty(@PathVariable int Id, @RequestBody String love ) {
        Pets pet1  = pettyRepository.findById(Id);
        pet1.setLove(love);
        pettyRepository.save(pet1);
        return pet1;
    }

    @RequestMapping(method= RequestMethod.GET, value="/petties/{username}")
    public List<Pets> getPetsByUser(@PathVariable String username)
    {
        User u = userService.getUserByUsername(username);
        return pettyService.getPetsByUser(u);
    }


    /*
    @RequestMapping("/pets/{productId}")
    public Pets getProduct(@PathVariable Integer productId){
        return pettyRepository.findById(productId);
    }

 */

/*
    @PutMapping("/products")
    public void updateProducts(@RequestBody OrderItemWrapper orderItemWrapper ) {
        pettyService.updatePets(orderItemWrapper);
    }
 */

}
