package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLog() {
        //Given
        //When
        //Then
        Logger.getInstance().log("john");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        Logger.getInstance().log("john");
        Logger.getInstance().log("Ana");
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Ana", result);
    }
}
