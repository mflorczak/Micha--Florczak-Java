package com.kodilla.good.patterns.challengers;

public class Game implements Item {
    private String gameName;

    public Game(final String gameName) {
        this.gameName = gameName;
    }

    @Override
    public String getNameItem() {
        return gameName;
    }
}
