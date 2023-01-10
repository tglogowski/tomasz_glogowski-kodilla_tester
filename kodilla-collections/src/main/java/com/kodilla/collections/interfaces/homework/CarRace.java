package com.kodilla.collections.interfaces.homework;

public class CarRace {
    private static final int SPEED_DECREMENT_VALUE = 10;
    public static void main(String[] args){

        Car ford = new Ford(20, SPEED_DECREMENT_VALUE);
        ford.increaseSpeed();
        ford.increaseSpeed();
        ford.increaseSpeed();
        ford.decreaseSpeed();
        ford.decreaseSpeed();

        Car jaguar = new Jaguar(35, SPEED_DECREMENT_VALUE);
        jaguar.increaseSpeed();
        jaguar.increaseSpeed();
        jaguar.increaseSpeed();
        jaguar.decreaseSpeed();
        jaguar.decreaseSpeed();

        Car renault = new Renault(25, SPEED_DECREMENT_VALUE);
        renault.increaseSpeed();
        renault.increaseSpeed();
        renault.increaseSpeed();
        renault.decreaseSpeed();
        renault.decreaseSpeed();

        doRace(ford);
        doRace(jaguar);
        doRace(renault);
    }

    private static void doRace(Car car) {

        System.out.println("Actual " + car.getClass().getSimpleName() + " speed: " + car.getSpeed());
    }
}
