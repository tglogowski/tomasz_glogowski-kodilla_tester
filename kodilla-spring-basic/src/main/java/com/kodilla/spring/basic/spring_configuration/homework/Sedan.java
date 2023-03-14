package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {

    private boolean headlightsTurnedOn;

    public Sedan(boolean headlightsTurnedOn) {
        this.headlightsTurnedOn = headlightsTurnedOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return headlightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}