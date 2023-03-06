package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private double value;
    private LocalDate date;
    private String login;

    public Order(double value, LocalDate date, String login) throws OrderException {
        this.value = value;
        this.date = date;
        this.login = login;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }
}