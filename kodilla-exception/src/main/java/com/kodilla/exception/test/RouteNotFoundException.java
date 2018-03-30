package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    Flight flight;

    public RouteNotFoundException(Flight flight) {
        this.flight = flight;
    }

    public String notFound( Flight flight) {
        return "Not found airport: " + flight.getArrivalAirport();
    }

    public Flight getFlight() {
        return flight;
    }
}
