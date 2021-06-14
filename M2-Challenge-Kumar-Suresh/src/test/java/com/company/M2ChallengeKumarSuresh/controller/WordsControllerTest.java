package com.company.M2ChallengeKumarSuresh.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(WordsController.class)
public class WordsControllerTest {
//Wiring in the MockMvc Object

    @Autowired
    private MockMvc mockMvc;
    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void shouldReturnARandomWord() throws Exception {
        // ARRANGE and ACT
        mockMvc.perform(get("/word"))
                .andDo(print())
                .andExpect(status().isOk())

                //ASSERT that JSON object is present and not empty.
                .andExpect(jsonPath("$").isNotEmpty());
    }
}