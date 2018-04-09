package com.kodilla.good.patterns.challengers;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        SellRequestRetriever sellRequestRetriever = new SellRequestRetriever();
        SellRequest sellRequest = sellRequestRetriever.sellRequest();
        ProductOrderService productOrderService = new ProductOrderService(sellRequest.getItem());
        ValidatorOrder.isSend("John", "Smith", productOrderService.process(sellRequest));
    }
}
