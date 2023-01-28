package com.kodilla.collections.adv.exercises.homework;

import java.util.*;
import java.util.stream.Collectors;

public class FlightFinder {

    private Map<String, List<Flight>> flightsFrom = new HashMap<>();
    private Map<String, List<Flight>> flightsTo = new HashMap<>();

    public FlightFinder(List<Flight> flights) {
//        flightsFrom = flights.stream().collect(Collectors.groupingBy(Flight::getDeparture));
//        flightsTo = flights.stream().collect(Collectors.groupingBy(Flight::getArrival));
        for (Flight flight : flights) {
            if (flightsFrom.containsKey(flight.getDeparture())) {
                flightsFrom.get(flight.getDeparture()).add(flight);
            } else {
                List<Flight> fl = new ArrayList<>();
                fl.add(flight);
                flightsFrom.put(flight.getDeparture(), fl);
            }
            if (flightsTo.containsKey(flight.getArrival())) {
                flightsTo.get(flight.getArrival()).add(flight);
            } else {
                List<Flight> fl = new ArrayList<>();
                fl.add(flight);
                flightsTo.put(flight.getArrival(), fl);
            }
        }
    }

    public List<Flight> findFlightsFrom(String departure) {
        return flightsFrom.getOrDefault(departure, Collections.emptyList());
    }

    public List<Flight> findFlightsTo(String arrival) {
        return flightsTo.getOrDefault(arrival, Collections.emptyList());
    }
}
