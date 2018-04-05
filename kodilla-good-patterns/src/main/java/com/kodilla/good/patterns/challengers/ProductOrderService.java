package com.kodilla.good.patterns.challengers;

import java.time.LocalDate;

public class ProductOrderService {
    private Item item;

    public ProductOrderService( Item item) {
        this.item = item;
    }

    public SellDto process(final SellRequest sellRequest) {
        ItemBuy itemBuy = new ItemBuy(item);
        boolean isSold = itemBuy.buy(sellRequest.getUser(),sellRequest.getNow());
        if(isSold) {
            return new SellDto(sellRequest.getUser(), true);
        } else {
            return new SellDto(sellRequest.getUser(), false);
        }
    }
}
