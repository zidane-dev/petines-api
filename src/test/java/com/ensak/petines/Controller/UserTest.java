package com.ensak.petines.Controller;

import com.ensak.petines.controller.UserController;
import com.ensak.petines.model.User;
import com.ensak.petines.repositories.UserRepository;
import com.ensak.petines.services.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.istack.internal.NotNull;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc

public class UserTest {
    @Autowired
    MockMvc mockMvc;


    @Mock
    private UserRepository userRepository;

    @Mock
    private UserService userService;

    @Mock
    private UserController userController;

    @Autowired
    private ObjectMapper objectMapper;
    @Test
    public void testListUsers() throws Exception{

        List<User> users = new ArrayList<>();
        users.add(new User("kziber","passkziber","kziber@gmail.com","oumaima","betana sale","0682640137"));

        Mockito.when(userRepository.findAll()).thenReturn(users);

        System.out.println(users.get(0).toString());
        String url = "/login";

        mockMvc.perform(get(url)).andExpect(status().isOk());

    }

    @Test
    public void createUserTest() throws Exception{
        User newUser = new User("kziber","passkziber","kziber@gmail.com","oumaima","betana sale","0682640137");
        User savedUser = new User("kziber","passkziber","kziber@gmail.com","oumaima","betana sale","0682640137");

        Mockito.when(userRepository.save(newUser)).thenReturn(savedUser);
        String url = "/login";

        mockMvc.perform(post(url)
        .contentType("application/json")
        .content(objectMapper.writeValueAsString(newUser))).andExpect(status().isOk());


    }

    @Test
    public void updateUserTest() throws Exception {
        String username = "kziber";
        User user = new User("KZIBER","password","kziber-oumaima@gmail.com","oumaima","betana sale","0682640137");

        Mockito.doNothing().when(userController).updateUser(username,user);
        String url = "/users/"+ username;
        mockMvc.perform(get(url)).andExpect(status().isOk());
        Mockito.verify(userController).updateUser(username,user);

    }
}
