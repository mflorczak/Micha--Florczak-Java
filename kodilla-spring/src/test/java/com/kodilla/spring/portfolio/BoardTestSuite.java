package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("cleaning the house");
        board.getDoneList().getTasks().add("coke dinner");
        board.getInProgressList().getTasks().add("learning programming");
        //Then
        Assert.assertEquals(1,board.getToDoList().getTasks().size());
        Assert.assertEquals(1,board.getDoneList().getTasks().size());
        Assert.assertEquals(1,board.getInProgressList().getTasks().size());
        System.out.println(board.getToDoList().getTasks().get(0));
        System.out.println(board.getDoneList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(0));
    }
}
