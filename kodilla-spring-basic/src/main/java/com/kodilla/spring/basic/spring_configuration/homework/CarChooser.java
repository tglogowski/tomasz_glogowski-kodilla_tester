package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class CarChooser {

    @Bean
    public Car chooseCar(LocalDateTime dateTime) {

        int month = dateTime.getMonthValue();
        int hour = dateTime.getHour();

        boolean lightsOnOrOff = false;

        if (hour >= 20 || hour < 6)
            lightsOnOrOff = true;

        if (month == 12 || month == 1 || month == 2) {
            return new SUV(lightsOnOrOff);
        } else if (month == 6 || month == 7 || month == 8) {
            return new Cabrio(lightsOnOrOff);
        } else {
            return new Sedan(lightsOnOrOff);
        }
    }
}