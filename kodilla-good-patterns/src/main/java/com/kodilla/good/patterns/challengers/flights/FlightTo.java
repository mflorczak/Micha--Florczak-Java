package com.kodilla.good.patterns.challengers.flights;

import java.util.Objects;

public class FlightTo {
    private final String flightTo;

    public FlightTo(final String flightTo) {
        this.flightTo = flightTo;
    }

    public String getFlightTo() {
        return flightTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlightTo)) return false;
        FlightTo flightTo1 = (FlightTo) o;
        return Objects.equals(flightTo, flightTo1.flightTo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(flightTo);
    }
}
