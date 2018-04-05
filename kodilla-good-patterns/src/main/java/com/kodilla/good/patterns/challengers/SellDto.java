package com.kodilla.good.patterns.challengers;

public class SellDto {
    private User user;
    private boolean isSold;

    public SellDto(final User user, final boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return isSold;
    }
}
