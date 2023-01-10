package com.kodilla.collections.interfaces.homework;

public class CarRace {
    private static final int SPEED_DECREMENT_VALUE = 20;
    public static void main(String[] args) {

        Car ford = new Ford(50, SPEED_DECREMENT_VALUE);
        Car jaguar = new Jaguar(70, SPEED_DECREMENT_VALUE);
        Car renault = new Renault(45, SPEED_DECREMENT_VALUE);

        doRace(ford);
        doRace(jaguar);
        doRace(renault);

    }
        private static void doRace(Car car) {

                for (int i = 0; i < 3; i++)
                    car.increaseSpeed();

                for (int i = 0; i < 2; i++)
                    car.decreaseSpeed();

                System.out.println("Actual " + car.getClass().getSimpleName() + " speed: " + car.getSpeed());
            }
}