package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    private FlightFinder flightFinder;

    @BeforeEach
    public void setup() {
        flightFinder = new FlightFinder(FlightRepository.getFlightsTable());
    }

    @Test
    public void testFindFlightsFrom() {
        //given
        //when
        List<Flight> result = flightFinder.findFlightsFrom("London");

        //then
        assertEquals(List.of(new Flight("London", "Warsaw"), new Flight("London", "Rome")), result);
    }

    @Test
    public void testFindFlightsFromWhenFlightTableIsEmpty() {
        //given
        flightFinder = new FlightFinder(List.of());

        //when
        List<Flight> result = flightFinder.findFlightsFrom("London");

        //then
        assertEquals(List.of(), result);
    }

    @Test
    public void testFindFlightsFromWhenNotFound() {
        //given
        //when
        List<Flight> result = flightFinder.findFlightsFrom("Chicago");

        //then
        assertEquals(List.of(), result);
    }

    @Test
    public void testFindFlightsTo() {
        //given
        //when
        List<Flight> result = flightFinder.findFlightsTo("London");

        //then
        assertEquals(List.of(new Flight("Warsaw", "London")), result);
    }

    @Test
    public void testFindFlightsToWhenFlightTableIsEmpty() {
        //given
        flightFinder = new FlightFinder(List.of());

        //when
        List<Flight> result = flightFinder.findFlightsTo("London");

        //then
        assertEquals(List.of(), result);
    }

    @Test
    public void testFindFlightsToWhenNotFound() {
        //given
        //when
        List<Flight> result = flightFinder.findFlightsTo("Chicago");

        //then
        assertEquals(List.of(), result);
    }
}
