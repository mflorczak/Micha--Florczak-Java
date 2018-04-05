package com.kodilla.good.patterns.challengers;

public class User {
    private String name;
    private String lastName;

    public User(final String name, final String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
