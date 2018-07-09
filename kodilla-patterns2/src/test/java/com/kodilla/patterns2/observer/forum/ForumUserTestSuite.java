package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelp = new JavaHelpForumTopic();
        ForumTopic javaTools = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelp.registerObserver(johnSmith);
        javaTools.registerObserver(ivoneEscobar);
        javaHelp.registerObserver(jessiePinkman);
        javaTools.registerObserver(jessiePinkman);

        //When
        javaHelp.addPost("Hi everyone! Could you help me with for loop?");
        javaHelp.addPost("Better try to use while loop in this case.");
        javaTools.addPost("Help pls, my MySQL db doesn`t want to work :(");
        javaHelp.addPost("Why while? Is it better?");
        javaTools.addPost("When I try to log in I got 'bad credentials' message.");

        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
