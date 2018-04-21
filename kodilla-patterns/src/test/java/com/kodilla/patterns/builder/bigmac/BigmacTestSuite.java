package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBuildBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With Sesame")
                .burgers(2)
                .sauce("Barbecue")
                .ingredients("Cheese")
                .ingredients("Onion")
                .ingredients("Garlic")
                .ingredients("Peeper")
                .ingredients("Salad")
                .build();
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        System.out.println(bigmac);
        Assert.assertEquals(5,howManyIngredients);
    }
}
