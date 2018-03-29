package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {

        try {
            if (b == 0) {
                throw new ArithmeticException();
            }

        } catch (ArithmeticException e) {
            System.out.println("division by zero! Error: " + e);
        }
        return a / b;
    }
}
