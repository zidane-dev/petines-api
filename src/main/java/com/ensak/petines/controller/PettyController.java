package com.ensak.petines.controller;

import com.ensak.petines.model.Pets;
import com.ensak.petines.repositories.PettyRepository;
import com.ensak.petines.services.PettyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PettyController {
    @Autowired
    PettyRepository pettyRepository;

    @Autowired
    PettyService pettyService;

    @RequestMapping(method= RequestMethod.GET, value="/petties")
    public List<Pets> getAllPets()    {
        return pettyRepository.findAll();
    }

    @RequestMapping(method= RequestMethod.POST, value="/petties")
    @ResponseBody
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
