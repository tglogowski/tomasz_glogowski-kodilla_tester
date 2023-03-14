package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {

    private boolean headlightsTurnedOn;

    public Cabrio(boolean headlightsTurnedOn) {
        this.headlightsTurnedOn = headlightsTurnedOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return headlightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}