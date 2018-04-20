package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shop = factory.makeTask(TaskFactory.SHOPPING);
        boolean result = shop.isTaskExecute(shop.executeTask(true));
        //Given
        Assert.assertTrue(result);
        Assert.assertEquals("Shopping into allegro", shop.getTaskName());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paint = factory.makeTask(TaskFactory.PAINTING);
        boolean result = paint.isTaskExecute(paint.executeTask(false));
        //Then
        Assert.assertFalse(result);
        Assert.assertEquals("Paint", paint.getTaskName());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drive = factory.makeTask(TaskFactory.DRIVING);
        boolean result = drive.isTaskExecute(drive.executeTask(true));
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals("Drive", drive.getTaskName());
    }


}
