package com.kodilla.good.patterns.challengers.flights;

import java.util.Objects;

public class FlightFrom {
    private final String flightFrom;

    public FlightFrom(final String flightFrom) {
        this.flightFrom = flightFrom;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlightFrom)) return false;
        FlightFrom that = (FlightFrom) o;
        return Objects.equals(flightFrom, that.flightFrom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightFrom);
    }
}
