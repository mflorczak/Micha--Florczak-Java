package com.kodilla.good.patterns.challengers.food.shop;

public class Application {
    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop(3,"milk");
        SellDto sellDto = new SellDto(extraFoodShop.process(),true);
        ShowProduct showProduct = new ShowProduct(extraFoodShop.process());
        System.out.println(showProduct);
        ValidatorOrder.isSend(sellDto,"ExtraFoodShop", "milk");
    }
}
