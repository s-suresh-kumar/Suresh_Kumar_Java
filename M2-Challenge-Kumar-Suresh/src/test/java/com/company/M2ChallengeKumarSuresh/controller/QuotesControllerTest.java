package com.company.M2ChallengeKumarSuresh.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@WebMvcTest(QuotesController.class)
public class QuotesControllerTest {

    //Wiring in the MockMvc Object

    @Autowired
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void setup() {
        // This is the standard set up method that runs before each test. It's typically used for instantiating test
        // objects. We don't have to do anything special for mockMvc since it's Autowired/  We will however be using
        // setup() in the future.
    }

    @Test
    public void shouldReturnARandomQuote() throws Exception {
       // ARRANGE and ACT
       mockMvc.perform(get("/quote"))
       .andDo(print())
       .andExpect(status().isOk())

       //ASSERT that JSON object is present and not empty.
       .andExpect(jsonPath("$").isNotEmpty());
    }
}