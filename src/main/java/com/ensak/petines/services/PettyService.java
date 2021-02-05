package com.ensak.petines.services;

import com.ensak.petines.model.OrderItem;
import com.ensak.petines.model.Pets;
import com.ensak.petines.repositories.PettyRepository;
import com.ensak.petines.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PettyService {
/*
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderItemRepository orderItemRepository;
 */
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

/*
    public void updatePets( OrderItemWrapper orderItemWrapper ) {
        Pets petty;
        for (OrderItem orderItem : orderItemWrapper.getOrderItemList()) {

            product = productRepository.findById(orderItem.getProduct().getPid());

            int oldQuantity = product.getQuantity();
            int newQuantity = orderItem.getQuantity();
            int updatedQuantity = oldQuantity - newQuantity;

            product.setPrice(orderItem.getProduct().getPrice());
            product.setProdImage(orderItem.getProduct().getProdImage());
            product.setProdStock(orderItem.getProduct().getProdStock());
            product.setProductName(orderItem.getProduct().getProductName());
            product.setStatus(orderItem.getProduct().getStatus());
            product.setProd_desc(orderItem.getProduct().getProd_desc());
            String sUpdatedQuantity = String.valueOf(updatedQuantity);

            product.setQuantity(updatedQuantity);

            productRepository.save(product);

        }

    }

 */

    public void deletePetty(int Id) {

        Pets mPetty = pettyRepository.findById(Id);
        /*
        code delete pet from database
         */
    }
}