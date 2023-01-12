package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {

    public static void main(String[] args) {
        List<Ford> cars = new ArrayList<>();

        addCars(cars);
        removeCars(cars);

        describeCars(cars);
    }

    private static void addCars(List<Ford> cars) {

        cars.add(new Ford(32, 7));
        cars.add(new Ford(26, 6));
        cars.add(new Ford(29, 7));
    }

    private static void describeCars(List<Ford> cars) {

        for (Ford ford: cars) {
            ford.increaseSpeed();
            CarUtils.describeCar(ford);
        }
    }

    private static void removeCars(List<Ford> cars) {

        cars.remove(2);
        Ford ford = new Ford(26,6);
        cars.remove(ford);
    }
}
