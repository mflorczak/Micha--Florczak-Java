package com.kodilla.good.patterns.challengers.flights;

public class FlightDatabase {
    private FlightFrom flightFromAirport;
    private FlightTo flightToAirport;

    public FlightDatabase(final FlightFrom flightFromAirport, final FlightTo flightToAirport) {
        this.flightFromAirport = flightFromAirport;
        this.flightToAirport = flightToAirport;
    }

    public FlightFrom getFlightFromAirport() {
        return flightFromAirport;
    }

    public FlightTo getFlightToAirport() {
        return flightToAirport;
    }

    @Override
    public String toString() {
        return "flightFromAirport = " + flightFromAirport.getFlightFrom() +
                ", flightToAirport = " + flightToAirport.getFlightTo();
    }
}
