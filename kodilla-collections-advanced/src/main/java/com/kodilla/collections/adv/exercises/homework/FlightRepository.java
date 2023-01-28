package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        return List.of(
                new Flight("London", "Warsaw"),
                new Flight("London", "Rome"),
                new Flight("Warsaw", "Rome"),
                new Flight("Warsaw", "New York"),
                new Flight("Warsaw", "London")
        );
    }
}


