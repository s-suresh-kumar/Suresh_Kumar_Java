package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {
    private ConverterIf converter;

    @org.junit.Before
    public void setUp() throws Exception {
        converter = new ConverterIf();
    }

    @Test
    public void shouldReturnCorrectMonthForMonthNos1Thru12() {
        String expectedMonth = "January";
        String monthReturned = converter.convertMonth(1);
        assertEquals(expectedMonth, monthReturned);

        expectedMonth = "April";
        monthReturned = converter.convertMonth(4);
        assertEquals(expectedMonth, monthReturned);

        expectedMonth = "December";
        monthReturned = converter.convertMonth(12);
        assertEquals(expectedMonth, monthReturned);
    }

    @Test
    public void shouldNotReturnIncorrectMonthForMonthNos1Thru12() {
        String incorrectMonth = "January";
        String monthReturned = converter.convertMonth(5);
        assertNotEquals(incorrectMonth, monthReturned);

        incorrectMonth = "April";
        monthReturned = converter.convertMonth(5);
        assertNotEquals(incorrectMonth, monthReturned);

        incorrectMonth = "December";
        monthReturned = converter.convertMonth(10);
        assertNotEquals(incorrectMonth, monthReturned);
    }
    @Test
    public void shouldReturnErrorStringMonthForMonthNosNot1Thru12() {
        int monthNumber = 0;
        String errorString = "Not a valid monthNumber = " + monthNumber;
        String monthReturned = converter.convertMonth(monthNumber);
        assertEquals(errorString, monthReturned);

        monthNumber = -1;
        errorString = "Not a valid monthNumber = " + monthNumber;
        monthReturned = converter.convertMonth(monthNumber);
        assertEquals(errorString, monthReturned);

        monthNumber = 13;
        errorString = "Not a valid monthNumber = " + monthNumber;
        monthReturned = converter.convertMonth(monthNumber);
        assertEquals(errorString, monthReturned);
    }
    @Test
    public void shouldReturnCorrectWeekDayForDayNos1Thru7() {
        String expectedDay = "Sunday";
        String dayReturned = converter.convertDay(1);
        assertEquals(dayReturned, dayReturned);

        expectedDay = "Wednesday";
        dayReturned = converter.convertDay(4);
        assertEquals(dayReturned, dayReturned);

        expectedDay = "Saturday";
        dayReturned = converter.convertDay(7);
        assertEquals(dayReturned, dayReturned);
    }

    @Test
    public void shouldNotReturnIncorrectDayForDayNos1Thru7() {
        String incorrectDay = "Sunday";
        String dayReturned = converter.convertDay(5);
        assertNotEquals(incorrectDay, dayReturned);

        incorrectDay = "Tuesday";
        dayReturned = converter.convertDay(5);
        assertNotEquals(incorrectDay, dayReturned);

        incorrectDay = "Saturday";
        dayReturned = converter.convertDay(6);
        assertNotEquals(incorrectDay, dayReturned);
    }
    @Test
    public void shouldReturnErrorStringDayForDayNosNot1Thru7() {
        int dayNumber = 0;
        String errorString = "Not a valid dayNumber = " + dayNumber;
        String dayReturned = converter.convertDay(dayNumber);
        assertEquals(errorString, dayReturned);

        dayNumber = -1;
        errorString = "Not a valid dayNumber = " + dayNumber;
        dayReturned = converter.convertDay(dayNumber);
        assertEquals(errorString, dayReturned);

        dayNumber = 13;
        errorString = "Not a valid dayNumber = " + dayNumber;
        dayReturned = converter.convertDay(dayNumber);
        assertEquals(errorString, dayReturned);
    }

}