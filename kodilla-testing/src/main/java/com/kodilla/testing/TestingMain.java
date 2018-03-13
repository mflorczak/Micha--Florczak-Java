package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main (String[] args) {
        SimpleUser simpleUser = new SimpleUser("TheForumUser");

        String result = simpleUser.getSipmleUser();

        if(result.equals("TheForumUser")) {
            System.out.println("Test ok");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int addResult = calculator.add(10,15);
        int subtractResult = calculator.subtract(13,4);

        if(addResult == 25 && subtractResult == 9) {
            System.out.println("Test ok");
        } else {
            System.out.println("Error!");
        }

    }
}
