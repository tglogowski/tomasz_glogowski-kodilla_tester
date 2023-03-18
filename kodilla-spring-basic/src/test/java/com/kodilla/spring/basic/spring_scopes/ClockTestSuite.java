package com.kodilla.spring.basic.spring_scopes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;


class ClockTestSuite {

    @Test
    public void shouldCreateDifferentTimeBeans() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Clock time1 = context.getBean(Clock.class);
        Thread.sleep(2000);
        Clock time2 = context.getBean(Clock.class);
        Thread.sleep(1000);
        Clock time3 = context.getBean(Clock.class);

        Assertions.assertNotEquals(time1,time2);
        Assertions.assertNotEquals(time2,time3);
        Assertions.assertNotEquals(time3,time1);
    }

    @Test
    public void shouldGetDifferentClockIndication() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Clock clock1 = context.getBean(Clock.class);
        LocalTime timeRec1 = clock1.getTime();
        Thread.sleep(2000);
        Clock clock2 = context.getBean(Clock.class);
        LocalTime timeRec2 = clock2.getTime();
        Thread.sleep(1000);
        Clock clock3 = context.getBean(Clock.class);
        LocalTime timeRec3 = clock3.getTime();

        Assertions.assertNotEquals(timeRec1,timeRec2);
        Assertions.assertNotEquals(timeRec2,timeRec3);
        Assertions.assertNotEquals(timeRec3,timeRec1);
    }
}