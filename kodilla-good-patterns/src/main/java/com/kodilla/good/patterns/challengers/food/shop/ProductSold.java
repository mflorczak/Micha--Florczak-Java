package com.kodilla.good.patterns.challengers.food.shop;

public class ProductSold {
    private Product product;

    public ProductSold(final Product product) {
        this.product = product;
    }

    public boolean sold(final Product product) {
        System.out.println("Company: " + product.company() +
                "\nProduct: " + product.getProductName() +
                "\nQuantity: " + product.getProductsQuantity());
        return true;
    }
}
