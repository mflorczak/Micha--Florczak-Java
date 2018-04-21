package com.kodilla.patterns.builder.pizza;

import org.junit.Assert;
import org.junit.Test;

public class PizzaTestSuite {
    @Test
    public void testPizzaNew() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Mushrooms")
                .ingredient("Ham")
                .build();
        System.out.println(pizza);
        //When
        int howManyIngredients = pizza.getIngredient().size();
        //Then
        Assert.assertEquals(3,howManyIngredients);
    }
}
