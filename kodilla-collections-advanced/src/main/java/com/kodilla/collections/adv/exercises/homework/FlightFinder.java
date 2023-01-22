package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {

    private static final int FROM = 0;
    private static final int TO = 1;

    public List<Flight> findFlightsFrom(String departure) {

        return FlightRepository.getFlightsTable(departure, FROM);
    }

    public List<Flight> findFlightsTo(String arrival) {

        return FlightRepository.getFlightsTable(arrival, TO);
    }
}
