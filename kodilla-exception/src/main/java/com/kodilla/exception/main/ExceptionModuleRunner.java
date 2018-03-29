package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.FirstChallenge;
import com.kodilla.exception.test.SecondChallenge;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        String result = exceptionHandling.exceptionHandling(1,2);
        System.out.println(result);

        try {
            FirstChallenge firstChallenge = new FirstChallenge();
            firstChallenge.divide(3,0);
        } catch(ArithmeticException e) {
            System.out.println("division by zero");
        }
    }
}
