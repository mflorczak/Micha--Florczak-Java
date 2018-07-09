package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Homework homework1 = new Homework("Michael");
        Homework homework2 = new Homework("Alex");
        Mentor johnSmith = new Mentor("John Smith");
        Mentor ivoneEscobar = new Mentor("Ivone Escobar");
        homework1.registerObserver(johnSmith);
        homework2.registerObserver(ivoneEscobar);

        //When
        homework1.addHomework("https://github.com/mflorczak/Micha--Florczak-Java1");
        homework2.addHomework("https://github.com/mflorczak/Micha--Florczak-Java2");
        homework1.addHomework("https://github.com/mflorczak/Micha--Florczak-Java3");

        assertEquals(2, johnSmith.getUpdateCount());
        assertEquals(1, ivoneEscobar.getUpdateCount());
    }
}
