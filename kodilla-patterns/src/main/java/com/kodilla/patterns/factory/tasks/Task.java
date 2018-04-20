package com.kodilla.patterns.factory.tasks;

public interface Task {
    boolean executeTask(boolean status);
    String getTaskName();
    boolean isTaskExecute(boolean result);
}
