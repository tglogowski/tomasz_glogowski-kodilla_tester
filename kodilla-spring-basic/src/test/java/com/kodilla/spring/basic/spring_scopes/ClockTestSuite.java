package com.kodilla.spring.basic.spring_scopes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class ClockTestSuite {

    @Test
    public void shouldCreateDifferentTasks() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock time_1 = context.getBean(Clock.class);
        Thread.sleep(2000);
        Clock time_2 = context.getBean(Clock.class);
        Thread.sleep(1000);
        Clock time_3 = context.getBean(Clock.class);

        Assertions.assertNotEquals(time_1,time_2);
        Assertions.assertNotEquals(time_2,time_3);
        Assertions.assertNotEquals(time_3,time_1);
    }
}