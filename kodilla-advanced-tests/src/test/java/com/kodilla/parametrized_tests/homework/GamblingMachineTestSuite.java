package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    private final GamblingMachine gbm = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/wrongNumbers.csv", numLinesToSkip = 1)
    public void testHowManyWinsWhenNumbersIncorrect(String input) {
        Set<Integer> numbs = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        assertThrows(InvalidNumbersException.class, () -> gbm.howManyWins(numbs));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv", numLinesToSkip = 1)
    public void testHowManyWins_DoCountWhenNumbersAreCorrect(String input) throws InvalidNumbersException {
        Set<Integer> numbs = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        int result = gbm.howManyWins(numbs);
        assertTrue(result >= 0 && result <= 6);
    }
}