package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DataSource {

    static Stream<Arguments> provideStringsForTestingLength() {
        return Stream.of(

                Arguments.of(40, 1.72, "Very severely underweight"),        //dla BMI<15
                Arguments.of(34, 1.50, "Severely underweight"),                     //dla BMI=15
                Arguments.of(42, 1.65, "Severely underweight"),                     //dla BMI<16
                Arguments.of(41, 1.60,"Underweight"),                               //dla BMI=16
                Arguments.of(51, 1.68,"Underweight"),                               //dla BMI<18.5
                Arguments.of(56, 1.70,"Normal (healthy weight)"),                   //dla BMI=18.5
                Arguments.of(75, 1.74,"Normal (healthy weight)"),                   //dla BMI<25
                Arguments.of(77.44, 1.76,"Overweight"),                             //dla BMI=25
                Arguments.of(81, 1.69,"Overweight"),                                //dla BMI<30
                Arguments.of(82.668, 1.66,"Obese Class I (Moderately obese)"),      //dla BMI=30
                Arguments.of(82, 1.54,"Obese Class I (Moderately obese)"),          //dla BMI<35
                Arguments.of(89.61, 1.60,"Obese Class II (Severely obese)"),        //dla BMI=35
                Arguments.of(59, 1.23,"Obese Class II (Severely obese)"),           //dla BMI<40
                Arguments.of(102.5, 1.6,"Obese Class III (Very severely obese)"),   //dla BMI=40
                Arguments.of(118, 1.69,"Obese Class III (Very severely obese)"),    //dla BMI<45
                Arguments.of(122.5125, 1.65,"Obese Class IV (Morbidly Obese)"),     //dla BMI=45
                Arguments.of(148, 1.73,"Obese Class IV (Morbidly Obese)"),          //dla BMI<50
                Arguments.of(120.126, 1.55,"Obese Class V (Super Obese)"),          //dla BMI=50
                Arguments.of(202, 1.94,"Obese Class V (Super Obese)"),              //dla BMI<60
                Arguments.of(216.6, 1.90,"Obese Class VI (Hyper Obese)"),           //dla BMI=60
                Arguments.of(180, 1.68,"Obese Class VI (Hyper Obese)")              //dla BMI>60
        );
    }
}
