package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Testing: begin");
    }

    @After
    public void after() {
        System.out.println("Testing: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList <Integer> empty = new ArrayList<>();
        //When
        ArrayList <Integer> list = oddNumbersExterminator.exterminate(empty);
        System.out.println("Testing: empty...");
        //Then
        Assert.assertEquals(empty.size(),list.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList <Integer> randomNumber = new ArrayList<>();
        //When
        for(int i=0; i<5; i++) {
            randomNumber.add(i);
        }
        System.out.println("Testing: normal...");
        ArrayList <Integer> evenList = oddNumbersExterminator.exterminate(randomNumber);
        //Then
        Assert.assertEquals(evenList.size(),3);

    }
}
