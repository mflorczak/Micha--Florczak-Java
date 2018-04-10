package com.kodilla.good.patterns.challengers.flights;

import java.util.Scanner;

public class ShowMenuAndChooseOprions {
    public static void show() {
        boolean end = false;

        while(!end) {
            Menu.menu();
            String option;
            Scanner in = new Scanner(System.in);
            option = in.nextLine().toUpperCase();
            switch (option) {
                case "1":
                    FlightSearch.showAllFlight();
                    break;
                case "2":
                    FlightSearch.showOnlyFlightTo(UserDialog.getAirport());
                    break;
                case "3":
                    FlightSearch.showOnlyFlightFrom(UserDialog.getAirport());
                    break;
                case "X":
                    Menu.exitApplication();
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }

        }
    }
}
