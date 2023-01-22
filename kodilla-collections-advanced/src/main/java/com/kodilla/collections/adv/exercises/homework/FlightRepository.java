package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    private static final Map<String, Set<Flight>> globalFlightsFrom = new HashMap<>();
    private static final Map<String, Set<Flight>> globalFlightsTo = new HashMap<>();

    public void addFlight(Flight flight) {
        addFlightsFrom(flight);
        addFlightsTo(flight);
    }

    private void addFlightsFrom(Flight flight) {

        Set<Flight> flightsFrom =
                globalFlightsFrom.getOrDefault(flight.getDeparture(), new LinkedHashSet<>());
        flightsFrom.add(flight);
        globalFlightsFrom.put(flight.getDeparture(), flightsFrom);
    }

    private void addFlightsTo(Flight flight) {

        Set<Flight> flightsTo =
                globalFlightsTo.getOrDefault(flight.getArrival(), new LinkedHashSet<>());
        flightsTo.add(flight);
        globalFlightsTo.put(flight.getArrival(), flightsTo);
    }

    public static List<Flight> getFlightsTable(String airport, int direction) {

        List<Flight> result = new ArrayList<>();
        switch (direction) {
            case 0:
                for (String key : globalFlightsFrom.keySet())
                    if (key.equals(airport)) result.addAll(globalFlightsFrom.get(key));
                break;
            case 1:
                for (String key : globalFlightsTo.keySet())
                    if (key.equals(airport)) result.addAll(globalFlightsTo.get(key));
                break;
        }
        return result;
    }
}


