package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testPostsNumberZero() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statistics.postsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        int quantityPosts = forumStatistics.getPostsNumber();

        //Then
        Assert.assertEquals(0,quantityPosts);
    }

    @Test
    public void testPostsNumberThousand() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statistics.postsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        int quantityPosts = forumStatistics.getPostsNumber();

        //Then
        Assert.assertEquals(1000,quantityPosts);
    }

    @Test
    public void testCommentsNumberZero() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statistics.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        int quantityComments = forumStatistics.getCommentsNumber();

        //Then
        Assert.assertEquals(0,quantityComments);
    }

    @Test
    public void testCommentsLessPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statistics.commentsCount()).thenReturn(3);
        when(statistics.postsCount()).thenReturn(10);

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        double averageQuantity = forumStatistics.getAverageCommentsForPost();

        //Then
        Assert.assertEquals(0.3,averageQuantity,Float.NaN);
    }

    @Test
    public void testPostsLessComments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statistics.postsCount()).thenReturn(6);
        when(statistics.commentsCount()).thenReturn(24);

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        double averageQuantity = forumStatistics.getAverageCommentsForPost();

        //Then
        Assert.assertEquals(4,averageQuantity,Double.NaN);
    }

    @Test
    public void testUserNumberZero() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> userList = new ArrayList<>();
        when(statistics.userName()).thenReturn(userList);

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        int quantityUsers = forumStatistics.getUsersNumber();

        //Then
        Assert.assertEquals(0,quantityUsers);
    }

    @Test
    public void testUserNumberHundred() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> userList = new ArrayList<>();
        for(int i=0; i<100; i++) {
            userList.add("new User");
        }
        when(statistics.userName()).thenReturn(userList);

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        int quantityUser = forumStatistics.getUsersNumber();

        //Then
        Assert.assertEquals(100,quantityUser);
    }
}
