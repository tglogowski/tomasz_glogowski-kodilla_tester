package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DataSource#provideStringsForTestingLength")
    public void testGetBMI(double inputWeight, double inputHeight, String expected) {
        assertEquals(expected, new Person(inputHeight,inputWeight).getBMI());
    }
}