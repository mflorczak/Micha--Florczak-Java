package com.kodilla.exception.main;

import com.kodilla.exception.test.FirstChallenge;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(30,0);

        System.out.println(result);
    }
}
