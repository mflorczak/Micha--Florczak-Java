package com.kodilla.good.patterns.challengers.food.shop;

public class SellDto {
    private Product product;
    private boolean isSold;

    public SellDto(Product product, boolean isSold) {
        this.product = product;
        this.isSold = isSold;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isSold() {
        return isSold;
    }
}
