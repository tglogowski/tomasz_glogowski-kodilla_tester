package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarChooser {

    @Bean
    public Car chooseCar(Clock date) {

        int month = date.getMonth();

        if (month == 12 || month == 1 || month == 2) {
            return new SUV();
        } else if (month == 6 || month == 7 || month == 8) {
            return new Cabrio();
        } else {
            return new Sedan();
        }
    }

     public void setLights(Car car, Clock time) {
        int hour = time.getHour();
        boolean lightsOn = hour >= 20 || hour < 6;
        car.setHeadlightsTurnedOn(lightsOn);
    }
}