package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    private final GamblingMachine gbm = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv", numLinesToSkip = 1)
    public void testShouldReturnFalseWhenSetHasSixNumbers(String input) {
        Set<Integer> numbs = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        assertFalse(gbm.isNotCorrectSize(numbs));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/wrongNumbers.csv", numLinesToSkip = 1)
    public void testShouldReturnTrueWhenSetHasMoreOrLessThanSixNumbers(String input) {
        Set<Integer> numbs = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        assertTrue(gbm.isNotCorrectSize(numbs));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv", numLinesToSkip = 1)
    public void testShouldReturnFalseWhenSetHasNumbersInScope(String input) {
        Set<Integer> numbs = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        assertFalse(gbm.isAnyNumberOutOfDeclaredScope(numbs));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/wrongNumbers.csv", numLinesToSkip = 1)
    public void testShouldReturnTrueWhenSetHasNumbersOutOfScope(String input) {
        Set<Integer> numbs = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        assertTrue(gbm.isAnyNumberOutOfDeclaredScope(numbs));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/wrongNumbers.csv", numLinesToSkip = 1)
    public void testValidateNumbersWhenAreWrong(String input) {
        Set<Integer> numbs = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        assertThrows(InvalidNumbersException.class, () -> gbm.validateNumbers(numbs));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/wrongNumbers.csv", numLinesToSkip = 1)
    public void testHowManyWinsWhenNumbersIncorrect(String input) {
        Set<Integer> numbs = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        assertThrows(InvalidNumbersException.class, () -> gbm.howManyWins(numbs));
    }

    @Test
    public void testGenerateComputerNumbers() {
        Set<Integer> result = new HashSet<>(gbm.generateComputerNumbers());
        assertFalse(result.size() != 6 || result.stream().anyMatch(n -> n < 1 || n > 49));
    }
}