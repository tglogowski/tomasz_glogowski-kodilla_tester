package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CarChooserTestSuite {


    @Autowired
    private CarChooser carChooser;

    @Test
    public void testChooseCarInDecember() {
        // given
        LocalDateTime december = LocalDateTime.of(2023, 12, 15, 15, 0);

        // when
        Car car = carChooser.chooseCar(december);

        // then
        assertEquals(SUV.class, car.getClass());
        assertEquals(true, car.hasHeadlightsTurnedOn());
        assertEquals("SUV", car.getCarType());
    }
}
