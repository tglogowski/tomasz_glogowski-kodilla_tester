package com.kodilla.parametrized_tests;

public class StringValidator {

    public boolean isBlank(String text) {
        return text == null || text.trim().isEmpty();
    }

    public int getStringLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ","");
    return value.length();
    }
}
