package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.homework.InvalidNumbersException;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GamblingMachine {
    public int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException {
        validateNumbers(userNumbers);
        Set<Integer> computerNumbers = generateComputerNumbers();
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        for(Integer numbs:computerNumbers)
            System.out.println(numbs);
        return count;
    }

    public void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (isNotCorrectSize(numbers) || isAnyNumberOutOfDeclaredScope(numbers)) {
            throw new InvalidNumbersException();
        }
    }

    public boolean isAnyNumberOutOfDeclaredScope(Set<Integer> numbers) {
        return numbers.stream()
                .anyMatch(number -> number < 1 || number > 49);
    }

    public boolean isNotCorrectSize(Set<Integer> numbers) {
        return numbers.size() != 6;
    }

    public Set<Integer> generateComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while (numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;
    }

//    public static void main(String[] args) throws InvalidNumbersException {
//
//        GamblingMachine gbm = new GamblingMachine();
//        Set<Integer> myNumbs = Set.of(2, 3, 4, 5, 6, 9);
//
//        System.out.println(gbm.howManyWins(myNumbs));
//    }
}
