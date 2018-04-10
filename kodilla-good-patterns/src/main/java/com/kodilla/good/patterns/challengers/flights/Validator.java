package com.kodilla.good.patterns.challengers.flights;

public class Validator {
    public static boolean validAirport(String airport) {
        boolean valid = true;
        for(int n=0; n<airport.length(); n++) {
            if (!((airport.charAt(n) >= 65 && airport.charAt(n) <= 90) || (airport.charAt(n) >= 97 && airport.charAt(n) <= 122))) {
                valid = false;
            }
        }
        return valid;
    }
}
