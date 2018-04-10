package com.kodilla.good.patterns.challengers.flights;

public class Menu {
    public static void menu() {
        System.out.println("1 - Show all flights" +
                "\n2 - Show only flights to city" +
                "\n3 - Show only flights from city" +
                "\nX - Close application" +
                "\nChoose option:");
    }

    public static void exitApplication() {
        System.exit(0);
    }
}
