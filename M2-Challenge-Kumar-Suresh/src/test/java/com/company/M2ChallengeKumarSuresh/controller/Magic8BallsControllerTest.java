package com.company.M2ChallengeKumarSuresh.controller;

import com.company.M2ChallengeKumarSuresh.models.Question;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(Magic8BallsController.class)
public class Magic8BallsControllerTest {
    //Wiring in the MockMvc Object
    @Autowired
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();

    // testing POST /records
    @Test
    public void shouldReturnAMagic8BallOnPostRequest() throws Exception {

        // ARRANGE
        Question inputQuestionJson = new Question();
        String inputQuestion = "Will I win PowerBall jackpot";
        inputQuestionJson.setQuestion(inputQuestion);

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(inputQuestionJson);

        // ACT
        mockMvc.perform(
                post("/magic")
                .content(inputJson)
                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$").isNotEmpty()
                );

    }


    @Test
    public void shouldReturn422StatusCodeWithInvalidRequestBody() throws Exception {
        // ARRANGE
        Question inputQuestion = new Question();
        inputQuestion.setQuestion("");

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(inputQuestion);

        // ACT
        mockMvc.perform(
                post("/magic")                                // Perform the POST request.
                        .content(inputJson)                               // Set the request body.
                        .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
        )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isUnprocessableEntity());             // ASSERT (status code is 422)

    // ARRANGE
        // Let us try empty question this time
        inputQuestion = new Question();
        inputQuestion.setQuestion("");

    // Convert Java Object to JSON.
    inputJson = mapper.writeValueAsString(inputQuestion);

    // ACT
        mockMvc.perform(
    post("/magic")                                // Perform the POST request.
                        .content(inputJson)                               // Set the request body.
                        .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
        )
                .andDo(print())                                           // Print results to console.
            .andExpect(status().isUnprocessableEntity());             // ASSERT (status code is 422)
}
}