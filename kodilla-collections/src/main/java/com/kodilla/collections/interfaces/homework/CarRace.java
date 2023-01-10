package com.kodilla.collections.interfaces.homework;

public class CarRace {

    private static Car[] car = new Car[3];
    private static final int SPEED_DECREMENT_VALUE = 20;
    public static void main(String[] args) {

        car[0] = new Ford(50, SPEED_DECREMENT_VALUE);
        car[1] = new Jaguar(70, SPEED_DECREMENT_VALUE);
        car[2] = new Renault(45, SPEED_DECREMENT_VALUE);

        doRace(car);

    }
        private static void doRace(Car[] car) {

            for (int j = 0; j < car.length; j++) {
                for (int i = 0; i < 3; i++)
                    car[j].increaseSpeed();

                for (int i = 0; i < 2; i++)
                    car[j].decreaseSpeed();

                System.out.println("Actual " + car[j].getClass().getSimpleName() + " speed: " + car[j].getSpeed());
            }
        }
}