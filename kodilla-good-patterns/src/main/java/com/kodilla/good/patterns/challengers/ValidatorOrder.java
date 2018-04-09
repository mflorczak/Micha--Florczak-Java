package com.kodilla.good.patterns.challengers;

public class ValidatorOrder {
    private  Item items;
    public static boolean validatorOrder(SellDto sellDto) {
        if(sellDto.isSold()) {
            return true;
        } return false;
    }


    public static void isSend(String name, String lastName, SellDto sellDto) {
        if(name.equals(User.getName()) && lastName.equals(User.getLastName()) && validatorOrder(sellDto)) {
            System.out.println("The order for " + User.getName() + " is send.");
        } else {
            System.out.println("We don't have this order");
        }
    }
}
