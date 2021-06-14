package com.company.M2ChallengeKumarSuresh.controller;

import com.company.M2ChallengeKumarSuresh.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class WordsController {
    private static int idCounter = 1;

    private static List<Definition> wordsList = new ArrayList<>(Arrays.asList(
            /*Reference - Words taken from internet
              https://www.vocabulary.com/lists/52473             */
            new Definition(idCounter++,"Consider", "deem to be"),
            new Definition(idCounter++, "minute", "infinitely or immeasurably small"),
            new Definition(idCounter++, "accord", "concurrence of opinion"),
            new Definition(idCounter++, "evident", "clearly revealed to the mind or the senses or" +
                    " judgement"),
            new Definition(idCounter++, "practice", "a customary way of operation or behavior"),
            new Definition(idCounter++, "intend", "have in mind as a purpose "),
            new Definition(idCounter++, "concern", "something that interests you bcause it is important"),
            new Definition(idCounter++, "commit", "perform an act, usually with a negative connotation"),
            new Definition(idCounter++, "issue", "some situation or event that is thought about"),
            new Definition(idCounter++, "approach", "move towards")
    ));

    @RequestMapping(value = "/word", method= RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public  Definition getDefinition() {
        int index = (int) ((Math.random() * wordsList.size()) );
        System.out.println("index = " + index);
        return wordsList.get(index);    }

}
