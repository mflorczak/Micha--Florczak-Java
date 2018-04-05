package com.kodilla.good.patterns.challengers;

import java.time.LocalDate;

public class ItemBuy {
    private Item item;

    public ItemBuy(final Item item) {
        this.item = item;
    }

    public boolean buy(User user, LocalDate now) {
        System.out.println("Sell item for: " + user.getName() + " " + user.getLastName() +
        " when: " + now.toString() + " Item: " + item.getNameItem());

        return true;
    }
}
