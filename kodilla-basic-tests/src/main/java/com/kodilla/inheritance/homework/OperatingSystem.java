package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void turnOn() {
        System.out.println("Operating system v" + getYear() + " is turn on");
    }

    public void turnOff() {
        System.out.println("Operating system v" + getYear() + " is turn off");
    }
}
