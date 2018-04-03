package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if(n >= 0 && n < shapes.size()) {
            shape = shapes.get(n);
        }
        return shape;
    }

    public String showFigures() {
        String figureType = shapes.stream()
                .map(Shape::getShapeName)
                .collect(Collectors.joining());
        return figureType;
    }

    public int getFiguresQuantity() {
        return shapes.size();
    }
}
