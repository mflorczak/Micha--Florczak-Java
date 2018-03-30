package com.kodilla.exception.main;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.RouteNotFoundException;
import com.kodilla.exception.test.SearchFlight;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        Flight noName = new Flight("", "Barcelona");
        Flight frankfurt = new Flight("", "Frankfurt");
        Flight ameterdam = new Flight("", "Amsterdam");

       try {
           SearchFlight.findFlight(ameterdam);
           SearchFlight.findFlight(frankfurt);
           SearchFlight.findFlight(noName);
       } catch (RouteNotFoundException e) {
           System.out.println(e.notFound(e.getFlight()));
       }
    }
}
