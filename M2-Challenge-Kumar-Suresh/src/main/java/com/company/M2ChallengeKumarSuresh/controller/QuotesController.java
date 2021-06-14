package com.company.M2ChallengeKumarSuresh.controller;

import com.company.M2ChallengeKumarSuresh.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class QuotesController {
    private static int idCounter = 1;

    private static List<Quote> quotesList = new ArrayList<>(Arrays.asList(
            /*Reference - Quotes taken from internet
            https://www.berries.com/blog/positive-quotes
             */
            new Quote(idCounter++,"Dr. Seuss", "You’re off to great places, today is your day." +
                    "Your mountain is waiting, so get on your way."),
            new Quote(idCounter++, "Mickey Rooney", "You always pass failure on the way to success."),
            new Quote(idCounter++, "Wolfgang Riebe", "No one is perfect - that’s why pencils have erasers"),
            new Quote(idCounter++, "Bonnie Blair", "Winning doesn’t always mean being first. " +
                    "Winning means you’re doing better than you’ve" +
                    " done before"),
            new Quote(idCounter++, "A.A. Mine", "You’re braver than you believe, and stronger than you " +
                    "seem, and smarter than you think."),
            new Quote(idCounter++, "Nelson Mandela", "It always seems impossible until it \n" +
                    "is done."),
            new Quote(idCounter++, "Helen Keller", "Keep your face to the sunshine and you cannot \n" +
                    "see a shadow"),
            new Quote(idCounter++, "Zig Ziglar", "Positive thinking will let you do everything better \n" +
                    "than negative thinking will."),
            new Quote(idCounter++, "Stephen Richards", "The only time you fail is when you fall down \n" +
                    "and stay down."),
            new Quote(idCounter++, "Paulo Coelho", "When you are enthusiastic about what you do, \n" +
                    "you feel this positive energy. It’s very simple.\n" )

    ));

    @RequestMapping(value ="/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuoteOfTheDay() {
        Quote quote;
        int index = (int) ((Math.random() * quotesList.size()) );
        System.out.println("index = " + index);
        quote = quotesList.get(index);
        return quote;
    }
}
