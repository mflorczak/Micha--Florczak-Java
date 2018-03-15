package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure () {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();

        //When
        shapeCollector.addFigure(square);

        //Then
        Assert.assertEquals(1,shapeCollector.getFiguresQuantity());

    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();
        shapeCollector.addFigure(square);

        //When
        boolean result = shapeCollector.removeFigure(square);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        shapeCollector.addFigure(circle);

        //When
        Shape shape = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(circle,shape);
    }
}
