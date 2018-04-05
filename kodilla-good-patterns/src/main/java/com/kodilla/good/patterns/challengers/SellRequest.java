package com.kodilla.good.patterns.challengers;

import java.time.LocalDate;

public class SellRequest {
    private User user;
    private LocalDate now;
    private Item item;

    public SellRequest(final User user, final LocalDate now, final Item item) {
        this.user = user;
        this.now = now;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getNow() {
        return now;
    }

    public Item getItem() {
        return item;
    }
}
