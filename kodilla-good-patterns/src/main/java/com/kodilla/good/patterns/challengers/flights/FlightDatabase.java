package com.kodilla.good.patterns.challengers.flights;

import java.util.Objects;

public class FlightDatabase {
    private FlightFrom flightFrom;
    private FlightTo flightTo;

    public FlightDatabase(final FlightFrom flightFrom, final FlightTo flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    public FlightFrom getFlightFrom() {
        return flightFrom;
    }

    public FlightTo getFlightTo() {
        return flightTo;
    }

    @Override
    public String toString() {
        return "flightFrom = " + flightFrom.getFlightFrom() +
                ", flightTo = " + flightTo.getFlightTo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlightDatabase)) return false;
        FlightDatabase that = (FlightDatabase) o;
        return Objects.equals(flightFrom, that.flightFrom) &&
                Objects.equals(flightTo, that.flightTo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(flightFrom, flightTo);
    }
}
