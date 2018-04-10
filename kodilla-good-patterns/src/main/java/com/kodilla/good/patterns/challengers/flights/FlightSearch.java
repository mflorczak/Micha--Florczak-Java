package com.kodilla.good.patterns.challengers.flights;

public class FlightSearch {
    public static void showAllFlight() {
        Flights.flight.stream()
                .forEach(System.out::println);
    }

    public static void showOnlyFlightTo(String airport) {
            Flights.flight.stream()
                    .filter(flightDatabase -> flightDatabase.getFlightToAirport().getFlightTo().equals(airport))
                    .forEach(System.out::println);
    }

    public static void showOnlyFlightFrom(String airport) {
        Flights.flight.stream()
                .filter(flightDatabase -> flightDatabase.getFlightFromAirport().getFlightFrom().equals(airport));
    }
}
