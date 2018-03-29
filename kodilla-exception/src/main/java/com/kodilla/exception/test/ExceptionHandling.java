package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {
    public String  exceptionHandling(double x, double y) {
        String result = "";
        try {
            SecondChallenge secondChallenge = new SecondChallenge();
            result = secondChallenge.probablyIWillThrowException(x, y);

        } catch (Exception e ) {
            System.out.println("Catch exception: " + e);
        } finally {
            System.out.println("Run...");
        }
        return result;

    }
}
