package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {

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

