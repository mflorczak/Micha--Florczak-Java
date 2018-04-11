package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    private Display display;

    public double executeExpression(double a, double b, MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(a,b);
        display.displayValue(result);
        return result;
    }

}
