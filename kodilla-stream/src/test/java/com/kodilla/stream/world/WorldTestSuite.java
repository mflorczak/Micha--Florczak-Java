package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");
        Country poland = new Country("Poland",new BigDecimal("333"));
        Country ireland = new Country("Ireland", new BigDecimal("1000"));
        Country slovakia = new Country("Slovakia", new BigDecimal("2000"));
        Country china = new Country("China", new BigDecimal("3000"));
        Country egypt = new Country("Egypt", new BigDecimal("2500"));
        europe.addCountry(poland);
        europe.addCountry(ireland);
        europe.addCountry(slovakia);
        africa.addCountry(egypt);
        asia.addCountry(china);
        world.addContinents(europe);
        world.addContinents(africa);
        world.addContinents(asia);

        //When
        BigDecimal actual = world.getPeopleQuantity();

        //
        BigDecimal expected = new BigDecimal("8833");
        Assert.assertEquals(expected,actual);
    }
}
