package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DataSource {

    static Stream<Arguments> provideStringsForTestingLength() {
        return Stream.of(
                Arguments.of(40, 1.72, "Very severely underweight"),
                Arguments.of(42, 1.65, "Severely underweight"),
                Arguments.of(51, 1.68,"Underweight"),
                Arguments.of(75, 1.74,"Normal (healthy weight)"),
                Arguments.of(81, 1.69,"Overweight"),
                Arguments.of(82, 1.54,"Obese Class I (Moderately obese)"),
                Arguments.of(59, 1.23,"Obese Class II (Severely obese)"),
                Arguments.of(118, 1.69,"Obese Class III (Very severely obese)"),
                Arguments.of(148, 1.73,"Obese Class IV (Morbidly Obese)"),
                Arguments.of(202, 1.94,"Obese Class V (Super Obese)"),
                Arguments.of(180, 1.68,"Obese Class VI (Hyper Obese)")
        );
    }
}
