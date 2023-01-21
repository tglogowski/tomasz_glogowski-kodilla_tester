package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    FlightRepository flightRepository = new FlightRepository();
    FlightFinder findFlights = new FlightFinder();

    @Test
    public void testFindFlightsFrom() {
        //given
        flightRepository.addFlight(new Flight("London", "Warsaw"));
        flightRepository.addFlight(new Flight("London", "Rome"));
        flightRepository.addFlight(new Flight("Warsaw", "Rome"));
        flightRepository.addFlight(new Flight("Warsaw", "New York"));
        flightRepository.addFlight(new Flight("Warsaw", "London"));

        //when
        List<Flight> result = findFlights.findFlightsFrom("London");

        //then
        List<Flight> expectedList = new LinkedList<>();
        expectedList.add(new Flight("London", "Warsaw"));
        expectedList.add(new Flight("London", "Rome"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsFrom_IfReturnsDuplicateFlights() {
        //given
        flightRepository.addFlight(new Flight("London", "Warsaw"));
        flightRepository.addFlight(new Flight("London", "Rome"));
        flightRepository.addFlight(new Flight("London", "Rome"));
        flightRepository.addFlight(new Flight("London", "Rome"));
        flightRepository.addFlight(new Flight("Warsaw", "Rome"));
        flightRepository.addFlight(new Flight("Warsaw", "London"));

        //when
        List<Flight> result = findFlights.findFlightsFrom("London");
        int sizeResult = result.size();

        //then
        List<Flight> expectedList = new LinkedList<>();
        expectedList.add(new Flight("London", "Warsaw"));
        expectedList.add(new Flight("London", "Rome"));
        int expectedSize = 2;
        assertEquals(expectedList, result);
        assertEquals(expectedSize, sizeResult);
    }

    @Test
    public void testFindFlightsTo() {
        //given
        flightRepository.addFlight(new Flight("London", "Warsaw"));
        flightRepository.addFlight(new Flight("London", "Rome"));
        flightRepository.addFlight(new Flight("Warsaw", "Rome"));
        flightRepository.addFlight(new Flight("Warsaw", "New York"));
        flightRepository.addFlight(new Flight("Warsaw", "London"));

        //when
        List<Flight> result = findFlights.findFlightsTo("Rome");

        //then
        List<Flight> expectedList = new LinkedList<>();
        expectedList.add(new Flight("London", "Rome"));
        expectedList.add(new Flight("Warsaw", "Rome"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo_IfReturnsDuplicateFlights() {
        //given
        FlightRepository flightRepository = new FlightRepository();

        flightRepository.addFlight(new Flight("London", "Warsaw"));
        flightRepository.addFlight(new Flight("London", "Rome"));
        flightRepository.addFlight(new Flight("London", "Rome"));
        flightRepository.addFlight(new Flight("London", "Rome"));
        flightRepository.addFlight(new Flight("Warsaw", "Rome"));
        flightRepository.addFlight(new Flight("Warsaw", "London"));
        flightRepository.addFlight(new Flight("Los Angeles", "Rome"));

        //when
        List<Flight> result = findFlights.findFlightsTo("Rome");
        int sizeResult = result.size();

        //then
        List<Flight> expectedList = new LinkedList<>();
        expectedList.add(new Flight("London", "Rome"));
        expectedList.add(new Flight("Warsaw", "Rome"));
        expectedList.add(new Flight("Los Angeles", "Rome"));
        int expectedSize = 3;
        assertEquals(expectedList, result);
        assertEquals(expectedSize, sizeResult);
    }
}
