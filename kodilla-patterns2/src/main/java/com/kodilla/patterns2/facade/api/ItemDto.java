package com.kodilla.patterns2.facade.api;

public class ItemDto {
    private final Long productId;
    private final double quantity;

    public double getQuantity() {
        return quantity;
    }

    public Long getProductId() {

        return productId;
    }

    public ItemDto(Long productId, double quantity) {

        this.productId = productId;
        this.quantity = quantity;
    }
}
