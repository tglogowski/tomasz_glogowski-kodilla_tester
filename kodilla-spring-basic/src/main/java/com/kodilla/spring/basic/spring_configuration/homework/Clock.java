package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Component;

@Component
public class Clock {

    private int month;
    private int hour;

    public void setMonth(int month) {
        this.month = month;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMonth() {
        return month;
    }

    public int getHour() {
        return hour;
    }
}