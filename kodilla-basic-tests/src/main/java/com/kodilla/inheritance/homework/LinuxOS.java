package com.kodilla.inheritance.homework;

public class LinuxOS extends OperatingSystem {

    public LinuxOS(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Linux v." + getYear() + " is turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Linux v." + getYear() + " is turn off");
    }
}
