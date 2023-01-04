package com.kodilla.inheritance.homework;

public class AppOS {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2020);
        WindwsOS windwsOS = new WindwsOS(2022);
        LinuxOS linuxOS = new LinuxOS(2005);

        operatingSystem.turnOn();
        operatingSystem.turnOff();

        windwsOS.turnOn();
        linuxOS.turnOn();

        windwsOS.turnOff();
        linuxOS.turnOff();
    }
}
