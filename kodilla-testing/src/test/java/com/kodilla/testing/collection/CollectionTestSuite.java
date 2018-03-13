package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList <Integer> empty = new ArrayList<>();
        //When
        ArrayList <Integer> list = oddNumbersExterminator.exterminate(empty);
        //Then
        Assert.assertEquals(empty.size(),list.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList <Integer> randomNumber = new ArrayList<>();
        //When
        for(int i=0; i<50; i++) {
            Random random = new Random();
            randomNumber.add(random.nextInt(100));
        }
        ArrayList <Integer> evenList = oddNumbersExterminator.exterminate(randomNumber);
        //Then

    }
}
