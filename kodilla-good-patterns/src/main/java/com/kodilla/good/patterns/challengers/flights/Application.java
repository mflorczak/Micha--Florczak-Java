package com.kodilla.good.patterns.challengers.flights;

import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Flights.flight.stream().forEach(System.out::println);
    }

}
