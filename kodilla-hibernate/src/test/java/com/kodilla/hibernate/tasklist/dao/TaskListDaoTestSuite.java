package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "inProgress";
    private static final String DESCRIPTION = "Task in progess";

    @Test
    public void testFindByLastName() {
        //Given
        TaskList taskList = new TaskList(DESCRIPTION, LISTNAME);
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readList = taskListDao.findByListName(listName);
        //Then
        Assert.assertEquals(1,readList.size());

        //CleanUp
        taskListDao.delete(taskList.getId());
    }
}
