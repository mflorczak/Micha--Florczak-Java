package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch(taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping into allegro", "shorts", 3);
            case PAINTING:
                return new PaintingTask("Paint", "green", "fence");
            case DRIVING:
                return new DrivingTask("Drive", "krakow", "truck");
                default:
                    return null;
        }
    }
}
