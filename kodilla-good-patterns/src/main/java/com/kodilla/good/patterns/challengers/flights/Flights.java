package com.kodilla.good.patterns.challengers.flights;

import java.util.HashSet;
import java.util.Set;

public class Flights {
    private static final String KRAKOW = "KRAKOW";
    private static final String WARSZAWA = "WARSZAWA";
    private static final String KATOWICE = "KATOWICE";
    private static final String BIALYSTOK ="BIALYSTOK";

    public static final Set<FlightDatabase> flight = new HashSet<>();
    static {
        flight.add(new FlightDatabase(new FlightFrom(KRAKOW), new FlightTo(WARSZAWA)));
        flight.add(new FlightDatabase(new FlightFrom(WARSZAWA), new FlightTo(KRAKOW)));
        flight.add(new FlightDatabase(new FlightFrom(KATOWICE), new FlightTo(BIALYSTOK)));
        flight.add(new FlightDatabase(new FlightFrom(BIALYSTOK), new FlightTo(KATOWICE)));
        flight.add(new FlightDatabase(new FlightFrom(KATOWICE), new FlightTo(WARSZAWA)));
        flight.add(new FlightDatabase(new FlightFrom(WARSZAWA), new FlightTo(KATOWICE)));
    }
}
