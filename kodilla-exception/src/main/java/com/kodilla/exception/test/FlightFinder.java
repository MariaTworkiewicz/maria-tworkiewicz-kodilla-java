package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    //private Flight flight;
    private final Map<String, Boolean> airportAvailability;


    public FlightFinder() {
        this.airportAvailability = new HashMap<>();
    }
    public Map<String, Boolean> getAirportAvailability() {
        airportAvailability.put("San Francisco", true);
        airportAvailability.put("Los Angeles", true);
        airportAvailability.put("San Diego", false);
        airportAvailability.put("Chicago", false);
        airportAvailability.put("New York", true);
        airportAvailability.put("Chicago", true);
        airportAvailability.put("Katowice", true);
        Map<String, Boolean> theAirports = new HashMap<>();
        theAirports.putAll(airportAvailability);
        return theAirports;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        getAirportAvailability().entrySet().stream()
                .filter(p -> p.getKey().equals(flight.getDepartureAirport()))
                .findAny()
                .orElseThrow(() -> new RouteNotFoundException("Unable to find Departure Airport: " + flight.getDepartureAirport()));

        boolean canLanding = getAirportAvailability().entrySet().stream()
                .filter(p -> p.getKey().equals(flight.getArrivalAirport()))
                .findAny()
                .map(v -> v.getValue())
                .orElseThrow(() -> new RouteNotFoundException("Unable to find Arrival Airport: " + flight.getArrivalAirport()));
        if(canLanding) {
            System.out.println("You can fly from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
        } else {
            System.out.print("I'm sorry, you cannot use: " + flight.getArrivalAirport() + " as your destination");
        }

      /*  if ((getAirportAvailability().get(flight.getArrivalAirport())) != null)
            getAirportAvailability().entrySet().stream()
                    .forEach(
                            pair -> {
                                if (pair.getKey().equals(flight.getArrivalAirport())) {
                                    if (pair.getValue()) {
                                        System.out.println("You can fly to " + pair.getKey());
                                    } else {
                                        System.out.println("I'm sorry you cannot fly to " + pair.getKey());
                                    }
                                }
                            }
                    );
        else {
            throw new RouteNotFoundException("Destination airport not found: " + flight.getArrivalAirport());
        }*/

   /* public void findFlight(Flight flight) throws RouteNotFoundException {
        airportAvailability.put("San Francisco", true);
        airportAvailability.put("Los Angeles", true);
        airportAvailability.put("San Diego", false);
        airportAvailability.put("Chicago", false);
        airportAvailability.put("New York", true);
        airportAvailability.put("Chicago", true);
*/


 /*       for (HashMap.Entry<String, Boolean> entry : airportAvailability.entrySet()) {
            if ((airportAvailability.get(flight.getArrivalAirport())) != null) {
                if (entry.getKey().equals(flight.getArrivalAirport())) {
                    if (entry.getValue()) {
                        System.out.println("You can fly to " + entry.getKey());
                    } else {
                        System.out.println("I'm sorry you cannot fly to " + entry.getKey());
                    }
                }
            } else {
                throw new RouteNotFoundException("Destination airport not found: " + flight.getArrivalAirport());
            }
        }*/
    }
}
