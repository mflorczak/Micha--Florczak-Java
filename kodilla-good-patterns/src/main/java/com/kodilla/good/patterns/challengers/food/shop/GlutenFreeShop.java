package com.kodilla.good.patterns.challengers.food.shop;

public class GlutenFreeShop implements Product {
    public static final String COMPANY = "ExtraFoodShop";
    private int productsQuantity;
    private String productName;

    public GlutenFreeShop(final int productsQuantity, final String productName) {
        this.productsQuantity = productsQuantity;
        this.productName = productName;
    }


    public GlutenFreeShop process() {
        return new GlutenFreeShop(productsQuantity, productName);
    }

    @Override
    public String company() {
        return COMPANY;
    }

    @Override
    public int getProductsQuantity() {
        return productsQuantity;
    }

    @Override
    public String getProductName() {
        return productName;
    }
}
