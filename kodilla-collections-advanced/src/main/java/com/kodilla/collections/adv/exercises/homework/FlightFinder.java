package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {

    private Set<Flight> flights = new LinkedHashSet<>();
    private List<Flight> result = new LinkedList<>();

    public List<Flight> findFlightsFrom(String departure) {

        flights = FlightRepository.getFlightsTable();
        for (Flight flightTo : flights) {
            if (flightTo.getDeparture().equals(departure)) result.add(flightTo);
        }
        return result;
    }

    public List<Flight> findFlightsTo(String arrival) {

        flights = FlightRepository.getFlightsTable();
        for (Flight flightFrom : flights) {
            if (flightFrom.getArrival().equals(arrival)) result.add(flightFrom);
        }
        return result;
    }
}
