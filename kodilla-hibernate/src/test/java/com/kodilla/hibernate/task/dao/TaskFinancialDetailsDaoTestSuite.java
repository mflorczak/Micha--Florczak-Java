package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskFinancialDetailsDaoTestSuite {
    @Autowired
    private TaskFinancialDetailsDao financialDetailsDao;

    @Test
    public void testFindByPaid() {
        //Given
        TaskFinancialDetails financialDetails = new TaskFinancialDetails(new BigDecimal(115), false);
        financialDetailsDao.save(financialDetails);
        int id = financialDetails.getId();

        //When
        List<TaskFinancialDetails> readTask = financialDetailsDao.findByPaid(false);

        //Then
        Assert.assertEquals(1,readTask.size());

        //CleanUp
        financialDetailsDao.delete(id);
    }

}
