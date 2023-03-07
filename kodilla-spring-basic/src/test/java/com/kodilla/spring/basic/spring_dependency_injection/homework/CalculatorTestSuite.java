package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {
        System.out.print("Result of adds = ");
        calculator.add(2, 3);
    }

    @Test
    public void testSubtract() {
        System.out.print("Result of subtract = ");
        calculator.subtract(5, 3);
    }

    @Test
    public void testMultiply() {
        System.out.print("Result of multiply = ");
        calculator.multiply(2, 4);
    }

    @Test
    public void testDivide() {
        System.out.print("Result of divide = ");
        calculator.divide(6, 2);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(4, 0));
    }
}