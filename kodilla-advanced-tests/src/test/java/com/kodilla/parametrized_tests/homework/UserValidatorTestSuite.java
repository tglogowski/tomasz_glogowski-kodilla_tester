package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"KaZiu43", "lelik_65", "_paja_", "Misza-ASZiK.12", "18_-_81", "..-__-.."})
    public void shouldReturnTrueForCorrectUsernameInput(String text) {
        boolean result = validator.validateUsername(text);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {",.78", "**A**", "Ax", "(-_-)", "ma#ma", "Elvis@"})
    public void shouldReturnFalseForCorrectUsernameInput(String text) {
        boolean result = validator.validateUsername(text);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Adik_67@o9.gr", "Takika_Be34@17.bl.com","Rafik.Walczak@pr.bla.uk", "Baja_18.45@ap.o", "_Precel_@bg.tr.a"})
    public void shouldReturnTrueForCorrectEmailInput(String text) {
        boolean result = validator.validateEmail(text);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"afid_eli.67U9.6.787@one5.ertyere", "alfred_tętni@o7.cze",
            "baileki@o7.be.gertych", "baileki@o7.be.ger8", "plalalla_17i@o7.@.pl","_Precel_@bg.tr."})
    public void shouldReturnFalseForCorrectEmailInput(String text) {
        boolean result = validator.validateEmail(text);
        assertFalse(result);
    }

}