package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {

    private boolean headlightsTurnedOn;


    @Override
    public boolean hasHeadlightsTurnedOn() {
        return headlightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
    public void setHeadlightsTurnedOn(boolean headlightsTurnedOn) {
        this.headlightsTurnedOn = headlightsTurnedOn;
    }
}