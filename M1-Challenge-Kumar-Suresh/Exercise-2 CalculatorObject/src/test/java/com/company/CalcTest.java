package com.company;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

    private Calc calc = new Calc();

    @Test
    public void shouldReturnProperValuesForIntegerAddMethod() {
        int expectedResult = 4;
        int resultGot = calc.add(2,2);
        assertEquals(expectedResult,resultGot);

        expectedResult = -4;
        resultGot = calc.add(-1,-3);
        assertEquals(expectedResult,resultGot);

        expectedResult = 0;
        resultGot = calc.add(-1,1);
        assertEquals(expectedResult,resultGot);

        expectedResult = 0;
        resultGot = calc.add(0,0);
        assertEquals(expectedResult,resultGot);
    }
    @Test
    public void shouldReturnProperValuesForIntegerSubtractMethod() {
        int expectedResult = 0;
        int resultGot = calc.subtract(2,2);
        assertEquals(expectedResult,resultGot);

        expectedResult = 2;
        resultGot = calc.subtract(-1,-3);
        assertEquals(expectedResult,resultGot);

        expectedResult = -2;
        resultGot = calc.subtract(-1,1);
        assertEquals(expectedResult,resultGot);

        expectedResult = 0;
        resultGot = calc.subtract(0,0);
        assertEquals(expectedResult,resultGot);
    }

    @Test
    public void shouldReturnProperValuesForIntegerMultiplyMethod() {
        int expectedResult = 4;
        int resultGot = calc.multiply(2,2);
        assertEquals(expectedResult,resultGot);

        expectedResult = 3;
        resultGot = calc.multiply(-1,-3);
        assertEquals(expectedResult,resultGot);

        expectedResult = -1;
        resultGot = calc.multiply(-1,1);
        assertEquals(expectedResult,resultGot);

        expectedResult = 0;
        resultGot = calc.multiply(0,0);
        assertEquals(expectedResult,resultGot);
    }

    @Test
    public void shouldReturnProperValuesForIntegerDivideMethod() {
        int expectedResult = 1;
        int resultGot = calc.divide(2,2);
        assertEquals(expectedResult,resultGot);

        expectedResult = 0;
        resultGot = calc.divide(-1,-3);
        assertEquals(expectedResult,resultGot);

        expectedResult = -1;
        resultGot = calc.divide(-1,1);
        assertEquals(expectedResult,resultGot);
    }

    @Test(expected = ArithmeticException.class)
    //expected result , divide by zero exception.
    public void shouldThrowExceptionForDivideByZeroForIntegerDiviveMethod() {
        int resultGot = calc.divide(0, 0);
    }


    @Test
    public void shouldReturnProperValuesForDoubleAddMethod() {
        double expectedResult = 4.0;
        double resultGot = calc.add(2.0,2.0);
        double delta = 0.0000001;
        assertEquals(expectedResult,resultGot,delta);

        expectedResult = -4.0;
        resultGot = calc.add(-1.0,-3.0);
        assertEquals(expectedResult,resultGot,delta);

        expectedResult = 0.0;
        resultGot = calc.add(-1.0,1.0);
        assertEquals(expectedResult,resultGot,delta);

        expectedResult = 0.0;
        resultGot = calc.add(0.0,0.0);
        assertEquals(expectedResult,resultGot,delta);
    }
    @Test
    public void shouldReturnProperValuesForDoubleSubtractMethod() {
        double expectedResult = 0.0 ;
        double resultGot = calc.subtract(2.0,2.0);
        double delta = 0.0000001;
        assertEquals(expectedResult, resultGot, delta);

        expectedResult = 2.0;
        resultGot = calc.subtract(-1.0,-3.0);
        assertEquals(expectedResult, resultGot, delta);

        expectedResult = -2.0;
        resultGot = calc.subtract(-1.0,1.0);
        assertEquals(expectedResult, resultGot, delta);

        expectedResult = 0.0;
        resultGot = calc.subtract(0.0,0.0);
        assertEquals(expectedResult, resultGot, delta);
    }

    @Test
    public void shouldReturnProperValuesForDoubleMultiplyMethod() {
        double expectedResult = 4.0;
        double resultGot = calc.multiply(2.0,2.0);
        double delta = 0.0000001;

        assertEquals(expectedResult, resultGot, delta);

        expectedResult = 3.0;
        resultGot = calc.multiply(-1.0,-3.0);
        assertEquals(expectedResult, resultGot, delta);

        expectedResult = -1.0;
        resultGot = calc.multiply(-1.0,1.0);
        assertEquals(expectedResult, resultGot, delta);

        expectedResult = 0;
        resultGot = calc.multiply(0,0);
        assertEquals(expectedResult,resultGot, delta);
    }

    @Test
    public void shouldReturnProperValuesForDoubleDivideMethod() {
        double expectedResult = 1;
        double resultGot = calc.divide(2.0,2.0);
        double delta = 0.0000001;

        assertEquals(expectedResult,resultGot,delta);

        expectedResult = 0.3333333;
        resultGot = calc.divide(-1.0,-3.0);
        assertEquals(expectedResult,resultGot, delta);

        expectedResult = -1.0;
        resultGot = calc.divide(-1.0,1.0);
        assertEquals(expectedResult,resultGot, delta);
    }

    @Test(expected = ArithmeticException.class)
    //expected result , infinity.
    public void shouldReturnInfinityForDivideByZeroForDoubleDivideMethod() {
        double expectedResult = Double.MAX_VALUE ;
        double delta = 0.0000001;
        double resultGot = calc.divide(0, 0);
        assertEquals(expectedResult, resultGot, delta);
    }


}
