package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    Flight flight;

    public FlightFinder() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlightFinder)) return false;

        FlightFinder that = (FlightFinder) o;

        return flight.equals(that.flight);
    }

    @Override
    public int hashCode() {
        return flight.hashCode();
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportAvailability = new HashMap<>();
        airportAvailability.put("San Francisco", true);
        airportAvailability.put("Los Angeles", true);
        airportAvailability.put("San Diego", false);
        airportAvailability.put("Chicago", false);
        airportAvailability.put("New York", true);
        airportAvailability.put("Chicago", true);


        for (HashMap.Entry<String, Boolean> entry : airportAvailability.entrySet()) {
            if((airportAvailability.get(flight.getArrivalAirport())) != null) {
                if (entry.getKey().equals(flight.getArrivalAirport())) {
                    if (entry.getValue()) {
                        System.out.println("You can fly to " + entry.getKey());
                    } else {
                        System.out.println("I'm sorry you cannot fly to " + entry.getKey());
                    }
                }
            }else {
                throw new RouteNotFoundException("Destination airport not found: " + flight.getArrivalAirport());
            }
        }
    }


    public static void main(String[] args) {
       // Flight ktwSfo = new Flight("Katowice", "Chicago");
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(new Flight("Katowice", "Chicago"));
            flightFinder.findFlight(new Flight("Teneryfa", "New York"));
            flightFinder.findFlight(new Flight("Krakow", "San Diego"));
            flightFinder.findFlight(new Flight("Krakow", "Dallas"));
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}
