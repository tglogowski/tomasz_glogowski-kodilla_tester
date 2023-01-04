package com.kodilla.abstracts.homework2;

public class Application {
    public static void main(String[] args) {

        Job driver = new Driver(3000, "drive safe");
        Job doctor = new Doctor(12000, "heal well");
        Job swimmer = new Swimmer(9000, "swim fast");

        Person person = new Person("Patty", 20, doctor);

        person.checkResponsibilities();
    }
}

