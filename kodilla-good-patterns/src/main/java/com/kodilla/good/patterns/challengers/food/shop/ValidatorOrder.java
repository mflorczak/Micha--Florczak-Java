package com.kodilla.good.patterns.challengers.food.shop;

public class ValidatorOrder {
    public static boolean validatorOrder(final SellDto sellDto, String company, String productName) {
        if(sellDto.isSold() && company == sellDto.getProduct().company()
                && productName == sellDto.getProduct().getProductName()) {
            return true;
        } return false;
    }

    public static void isSend(final SellDto sellDto, final String company, final String productName) {
        if(validatorOrder(sellDto, company, productName)) {
            System.out.println("The order from " + sellDto.getProduct().company() + " is send.");
        } else {
            System.out.println("We don't have this order");
        }
    }

}
