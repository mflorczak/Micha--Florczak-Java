package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main (String[] args) {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();
        shapeCollector.addFigure(square);

       String name = shapeCollector.showFigures();
        System.out.println(name);
    }
}
