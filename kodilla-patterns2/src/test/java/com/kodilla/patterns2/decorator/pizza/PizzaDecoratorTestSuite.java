package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaDecoratorTestSuite {
    @Test
    public void testBasicOrderPizzaGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        System.out.println(thePizza.getCost());

        //When
        BigDecimal theCost = thePizza.getCost();

        //Then
        assertEquals(new BigDecimal("15"), theCost);
    }

    @Test
    public void testBasicOrderPizzaGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        System.out.println(thePizza.getDescription());

        //When
        String description = thePizza.getDescription();

        //Then
        assertEquals("Pizza with: \n tomato sauce \n cheese \n bottom thin \n", description);
    }

    @Test
    public void testDoubleCheesePizzaGetPrice() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new DoubleCheeseDecorator(thePizza);
        System.out.println(thePizza.getCost());

        //When
        BigDecimal theCost = thePizza.getCost();

        //Then
        assertEquals(new BigDecimal("20"), theCost);
    }

    @Test
    public void testDoubleCheesePizzaGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new DoubleCheeseDecorator(thePizza);
        System.out.println(thePizza.getDescription());

        //When
        String description = thePizza.getDescription();

        //Then
        assertEquals("Pizza with: \n tomato sauce \n cheese \n bottom thin \n double cheese\n", description);
    }

    @Test
    public void testDoubleCheeseWithOnionPizzaGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new DoubleCheeseDecorator(thePizza);
        thePizza = new OnionDecorator(thePizza);
        System.out.println(thePizza.getCost());

        //When
        BigDecimal theCost = thePizza.getCost();

        //Then
        assertEquals(new BigDecimal("23.5"), theCost);
    }

    @Test
    public void testDoubleCheeseWithOnionPizzaGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new DoubleCheeseDecorator(thePizza);
        thePizza = new OnionDecorator(thePizza);
        System.out.println(thePizza.getDescription());

        //When
        String description = thePizza.getDescription();

        //Then
        assertEquals("Pizza with: \n tomato sauce \n cheese \n bottom thin \n double cheese\n onion\n", description);
    }

}
