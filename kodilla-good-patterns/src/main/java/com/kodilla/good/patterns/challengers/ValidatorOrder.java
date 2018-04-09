package com.kodilla.good.patterns.challengers;

public class ValidatorOrder {
    private  Item items;
    public static boolean validatorOrder(final SellDto sellDto, final String name, final String lastName) {
        if(sellDto.isSold() && name.equals(User.getName()) && lastName.equals(User.getLastName())) {
            return true;
        } return false;
    }


    public static void isSend(final String name, final String lastName, final SellDto sellDto) {
        if(validatorOrder(sellDto, name,lastName)) {
            System.out.println("The order for " + User.getName() + " is send.");
        } else {
            System.out.println("We don't have this order");
        }
    }
}
