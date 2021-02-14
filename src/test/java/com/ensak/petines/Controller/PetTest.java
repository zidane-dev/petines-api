package com.ensak.petines.Controller;

import com.ensak.petines.controller.PettyController;
import com.ensak.petines.controller.UserController;
import com.ensak.petines.model.Pets;
import com.ensak.petines.model.User;
import com.ensak.petines.repositories.PettyRepository;
import com.ensak.petines.repositories.UserRepository;
import com.ensak.petines.services.PettyService;
import com.ensak.petines.services.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class PetTest {

    @Autowired
    MockMvc mockMvc;


    @Mock
    private PettyRepository pettyRepository;

    @Mock
    private PettyService pettyService;

    @Mock
    private PettyController pettyController;

    @Mock
    private UserController userController;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void addPetTest() throws Exception{

        User u = userController.getUsername("kziber");
        Pets pet = new Pets();
        pet.setId(3);
        pet.setName("mario");
        pet.setBirth("2020-01-01");
        pet.setBreed(null);
        pet.setDescription("pretty dog");
        pet.setGender(0);
        pet.setSpecies(null);
        pet.setLove("false");
        pet.setUser(u);




    }
}
