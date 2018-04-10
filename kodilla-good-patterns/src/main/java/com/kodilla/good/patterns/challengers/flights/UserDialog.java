package com.kodilla.good.patterns.challengers.flights;

import java.util.Scanner;

public class UserDialog {
    public static String getAirport() {
        String airport;
        Scanner in = new Scanner(System.in);
        airport = in.nextLine().toUpperCase();

        while(true) {
            if(!Validator.validAirport(airport)) {
                System.out.println("Invalid characters, please use only letters!");
            } return airport;
        }
    }
}
