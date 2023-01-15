package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 21;
        int b = 7;
        int subtrackResult = calculator.subtract(a, b);
        assertEquals(14, subtrackResult);
    }

    @Test
    public void testSquarePositiveNumber() {
        Calculator calculator = new Calculator();
        int a = 2;
        double squareNumberResult = calculator.squareNumber(a);
        assertEquals(4, squareNumberResult, 0.1);
    }

    @Test
    public void testSquareZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        double squareNumberResult = calculator.squareNumber(a);
        assertEquals(0, squareNumberResult, 0.1);
    }

    @Test
    public void testSquareNegativeNumber() {
        Calculator calculator = new Calculator();
        int a = -3;
        double squareNumberResult = calculator.squareNumber(a);
        assertEquals(9, squareNumberResult, 0.1);
    }
}