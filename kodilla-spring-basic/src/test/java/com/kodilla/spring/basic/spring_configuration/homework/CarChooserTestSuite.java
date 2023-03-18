package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarChooserTestSuite {


    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
    Clock clock = context.getBean(Clock.class);
    CarChooser carChooser = new CarChooser();

    @Test
    public void shouldReturnSedanWithLightsOffAtSpring() {
        // given
        clock.setMonth(3);
        clock.setHour(10);
        // when
        Car car = carChooser.chooseCar(clock);
        carChooser.setLights(car,clock);
        // then
        assertEquals("Sedan", car.getCarType());
        assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSedanWithLightsOnAtAutumn() {
        // given
        clock.setMonth(9);
        clock.setHour(22);
        // when
        Car car = carChooser.chooseCar(clock);
        carChooser.setLights(car,clock);
        // then
        assertEquals("Sedan", car.getCarType());
        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSuvWithLightsOnAtWinter() {
        // given
        clock.setMonth(12);
        clock.setHour(20);
        // when
        Car car = carChooser.chooseCar(clock);
        carChooser.setLights(car,clock);
        // then
        assertEquals("SUV", car.getCarType());
        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnCabrioWithLightsOffAtSummer() {
        // given
        clock.setMonth(7);
        clock.setHour(6);
        // when
        Car car = carChooser.chooseCar(clock);
        carChooser.setLights(car,clock);
        // then
        assertEquals("Cabrio", car.getCarType());
        assertFalse(car.hasHeadlightsTurnedOn());
    }
}