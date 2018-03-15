package com.kodilla.testing.shape;

import java.util.ArrayList;

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

    public Shape showFigures() {
        return null;
    }

    public int getFiguresQuantity() {
        return shapes.size();
    }
}
