package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchFlight {
    public static void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airport = new HashMap<>();
        airport.put("Heathrow", true);
        airport.put("Paris-CDG", true);
        airport.put("Amsterdam", true);
        airport.put("Frankfurt", false);
        airport.put("Madryt–Barajas", true);
        airport.put("Paryż-Orly", false);

        List<Boolean> resultList = airport.entrySet().stream()
                .filter(e -> e.getKey().equals(flight.getArrivalAirport()))
                .map(e -> e.getValue())
                .collect(Collectors.toList());

        if(resultList.isEmpty()) {
            throw new RouteNotFoundException(flight);
        } else if(resultList.get(0)) {
            System.out.println("You can flight to: " + flight.getArrivalAirport());
        } else {
            System.out.println("You can`t flight to: " + flight.getArrivalAirport());
        }
    }
}
