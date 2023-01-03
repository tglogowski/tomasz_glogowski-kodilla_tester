package com.kodilla.inheritance.homework;

public class WindwsOS extends OperatingSystem {

    public WindwsOS(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Windows v." + getYear() + " is turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows v." + getYear() + " is turn off");
    }
}
