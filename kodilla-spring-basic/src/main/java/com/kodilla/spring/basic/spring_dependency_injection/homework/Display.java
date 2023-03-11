package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public String display(double value) {
        String result = "Result: " + value;
        System.out.println(result);
        return result;
    }
}