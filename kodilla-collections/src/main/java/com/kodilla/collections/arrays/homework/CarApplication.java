package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.*;

import java.util.Random;

public class CarApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Car[] cars = new Car[RANDOM.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }
        for (Car car : cars) {
            CarUtils.driveSimulate(car);
            CarUtils.describeCar(car);
        }
    }
    public static Car drawCar() {

        int drawnCarKind = RANDOM.nextInt(3);
        int speedIncrement = RANDOM.nextInt(31);
        int speedDecrement = RANDOM.nextInt(2) + 4;
        if (drawnCarKind == 0)
            return new Ford(speedIncrement, speedDecrement);
        else if (drawnCarKind == 1)
            return new Jaguar(speedIncrement, speedDecrement);
        else return new Renault(speedIncrement, speedDecrement);
    }
}
