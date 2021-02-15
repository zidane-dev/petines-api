package com.ensak.petines.Controller;

import com.ensak.petines.controller.PettyController;
import com.ensak.petines.controller.UserController;
import com.ensak.petines.model.Favourite;
import com.ensak.petines.model.Pets;
import com.ensak.petines.model.User;
import com.ensak.petines.repositories.FavouritesRepository;
import com.ensak.petines.repositories.UserRepository;
import com.ensak.petines.services.FavouriteService;
import com.ensak.petines.services.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc

public class FavouritesTest {
    @Autowired
    MockMvc mockMvc;


    @Mock
    private FavouritesRepository favouritesRepository;


    @Mock
    private UserController userController;

    @Mock
    private PettyController pettyController;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void addFavouriteTest() throws Exception {

        User u = userController.getUsername("kziber");
        Pets pet = pettyController.getPettyById(1);
        Favourite newFavourite = new Favourite(u,pet,true);
        Favourite savedFavourite = new Favourite(u,pet,true);

        Mockito.when(favouritesRepository.save(newFavourite)).thenReturn(savedFavourite);
        String url = "/login";

        mockMvc.perform(post(url)
                .contentType("application/json")
                .content(objectMapper.writeValueAsString(newFavourite))).andExpect(status().isOk());
    }
}
