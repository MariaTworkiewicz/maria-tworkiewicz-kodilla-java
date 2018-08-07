package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Weekend trip","San Antonio", "car");
            case PAINTING:
                return new PaintingTask("Family room' painting", "pink", "family room");
            case SHOPPING:
                return new ShoppingTask("kids back-to-school clothes", "dresses", 10);
            default:
                return null;
        }

    }
}
