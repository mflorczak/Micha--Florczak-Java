package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result1 = calculator.executeExpression(10, 10,(a,b) -> a + b);
        double result2 = calculator.executeExpression(20, 7, (a,b) -> a - b );
        double result3 = calculator.executeExpression(3, 5, (a,b) -> a * b);
        double result4 = calculator.executeExpression(45, 5, (a,b) -> a / b);
        //Then
        Assert.assertEquals(20, result1,0);
        Assert.assertEquals(13, result2,0);
        Assert.assertEquals(15, result3,0);
        Assert.assertEquals(9, result4,0);
    }
}
