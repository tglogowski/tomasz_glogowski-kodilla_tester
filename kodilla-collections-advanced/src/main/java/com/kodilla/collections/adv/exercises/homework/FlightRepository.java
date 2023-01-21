package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    private static Set<Flight> flights = new LinkedHashSet<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public static Set<Flight> getFlightsTable() {
        return flights;
    }
}


