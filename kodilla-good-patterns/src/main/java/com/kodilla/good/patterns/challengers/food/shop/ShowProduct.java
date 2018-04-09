package com.kodilla.good.patterns.challengers.food.shop;

public class ShowProduct {
    private final String name;
    private final int quantity;
    private final String company;

    public ShowProduct(final Product product) {
        name = product.getProductName();
        quantity = product.getProductsQuantity();
        company = product.company();

    }

    @Override
    public String toString() {
        return "ShowProduct{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", company='" + company + '\'' +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
