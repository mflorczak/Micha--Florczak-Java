package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int [] numbers = new int[20];
        double average = 0;
        for(int i=0; i<20; i++){
            numbers[i] = i;
            average+= numbers[i];
        }

        //When
        double result = getAverage(numbers);
        average = average/20;

        //Then
        Assert.assertEquals(average,result,0);
    }
}
