package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDoList")
    TaskList taskList1;
    @Autowired
    @Qualifier("inProgressList")
    TaskList taskList2;
    @Autowired
    @Qualifier("doneList")
    TaskList taskList3;

    @Bean()
    public Board getBoard() {
        return new Board(taskList1, taskList2, taskList3);
    }

    @Bean(name ="toDoList")
    @Scope
    public TaskList getTaskList1() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    @Scope
    public TaskList getTaskList2() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    @Scope
    public TaskList getTaskList3() {
        return new TaskList();
    }
}
