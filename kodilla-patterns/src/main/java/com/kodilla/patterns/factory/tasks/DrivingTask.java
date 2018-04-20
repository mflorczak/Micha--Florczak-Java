package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public boolean executeTask(boolean status) {
        if(!status) {
            System.out.println("The " + using + " is transport to " + where);
        } else {
            System.out.println("The task comming now to " + where + " using " + using );
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
