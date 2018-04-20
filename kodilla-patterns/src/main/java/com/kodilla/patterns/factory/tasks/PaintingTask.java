package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public boolean executeTask(boolean status) {
        if(!status) {
            System.out.println("The " + whatToPaint + " is painting for " + color);
        } else {
            System.out.println("The end painting " + whatToPaint + " for " + color);
        }
        return status;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecute(boolean result) {
        if(result) {
            System.out.println("Task is execute");
        } else {
            System.out.println("Task is not execute");
        }
        return result;
    }
}
