package com.techreturners.apilab1.controller;

import com.techreturners.apilab1.model.Coffee;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
@AutoConfigureMockMvc


@SpringBootTest
class CoffeeControllerTest {
    @Autowired
    private MockMvc mockMvcController;

    @Test
    public void testGetCoffee() throws Exception {
        String expectedCoffee = "I like coffee!";

        this.mockMvcController.perform(  //Make a GET request to the '/' endpoin
                        MockMvcRequestBuilders.get("/coffeelover"))
                //Matchers are helpful methods that help you write your assertions
                // According to the requirement, we expect 200 OK Status Code as a Response
                // According to the requirement, we expect the string as a Response
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedCoffee));
    }


    //todo:how to test the json result?
    @Disabled
    public void testGetCoffeeDefaultLatte() throws Exception {
        Coffee defaultCoffee = new Coffee(2, "latte");


        String expectedCoffee = "latte";

        this.mockMvcController.perform(MockMvcRequestBuilders.get("/coffee"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedCoffee));
    }
}