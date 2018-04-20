package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public boolean executeTask(boolean status) {
        if(!status) {
            System.out.println("The " + whatToBuy + " is shopping, quantity:  " + quantity);
        } else {
            System.out.println("The end shopping " + whatToBuy + " quantity " + quantity );
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
