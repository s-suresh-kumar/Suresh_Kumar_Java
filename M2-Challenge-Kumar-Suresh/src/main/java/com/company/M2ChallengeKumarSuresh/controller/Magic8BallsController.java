package com.company.M2ChallengeKumarSuresh.controller;

import com.company.M2ChallengeKumarSuresh.models.Answer;
import com.company.M2ChallengeKumarSuresh.models.Question;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class Magic8BallsController {
    private static int idCounter = 1;

    private static List<Answer> answerList = new ArrayList<>(Arrays.asList(
            /*Reference - Quotes taken from internet
            https://www.berries.com/blog/positive-quotes
             */
            new Answer(idCounter++,"", "Without a doubt"),
            new Answer(idCounter++, "", "Yes definitely"),
            new Answer(idCounter++, "", "It is decidedly so"),
            new Answer(idCounter++, "", "Most likely"),
            new Answer(idCounter++, "", "Cannot predict now"),
            new Answer(idCounter++, "", "Better not tell you now"),
            new Answer(idCounter++, "", "Ask again later"),
            new Answer(idCounter++, "", "Don't count on it"),
            new Answer(idCounter++, "", "Very doubtful"),
            new Answer(idCounter++, "", "My reply is no")

    ));


    @RequestMapping(value ="/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer getMagic8BallAnswer(@RequestBody @Valid Question question) {
        Answer answer;
        int index = (int) ((Math.random() * answerList.size()) );
        System.out.println("index = " + index);
        answer = answerList.get(index);
        answer.setQuestion(question.getQuestion());
        return answer;
    }


}
