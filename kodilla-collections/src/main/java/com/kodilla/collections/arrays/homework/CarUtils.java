package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Jaguar;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.Random;

public class CarUtils {

    private static final Random RANDOM = new Random();

    public static void describeCar(Car car) {
        System.out.println(("---------------------------------------"));
        System.out.println("The car brand: " + getCarName(car));
        System.out.println("Actual car speed: " + car.getSpeed());

    }

    private static  String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Jaguar)
            return "Jaguar";
        else if (car instanceof Renault)
            return "Renault";
        else
            return "Unknown car name";
    }

    public static void driveSimulate(Car car) {

        int numberOfSimEvent = RANDOM.nextInt(31) + 10;

        for (int i = 0; i < numberOfSimEvent; i++)
            car.increaseSpeed();
        for (int i = 0; i < Math.abs(numberOfSimEvent - 5); i++)
            car.decreaseSpeed();
    }
}
