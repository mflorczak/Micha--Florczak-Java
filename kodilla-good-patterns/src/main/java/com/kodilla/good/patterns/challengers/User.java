package com.kodilla.good.patterns.challengers;

public class User {
    private static String name;
    private static String lastName;

    public User(final String name, final String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public static String getName() {
        return name;
    }

    public static String getLastName() {
        return lastName;
    }
}
