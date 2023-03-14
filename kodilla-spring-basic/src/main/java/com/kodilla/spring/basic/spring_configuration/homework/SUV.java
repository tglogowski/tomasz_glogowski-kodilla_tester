package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {

    private boolean headlightsTurnedOn;

    public SUV(boolean headlightsTurnedOn) {
        this.headlightsTurnedOn = headlightsTurnedOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return headlightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}