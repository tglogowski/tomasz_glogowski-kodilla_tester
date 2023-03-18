package com.kodilla.spring.basic.spring_scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Component
@Scope("prototype")
public class Clock {

    private LocalTime time;

    public Clock() {
        this.time = LocalTime.now();
    }

    public LocalTime getTime() {
        return time;
    }
}