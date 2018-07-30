package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private ForumStatistics forumStatistics;
    private Statistics statisticsMock;


    @Before
    public void beforeTest() {

        statisticsMock = mock(Statistics.class);
        List<String> usersNamesMock = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            usersNamesMock.add("John Smith" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesMock);
        when(statisticsMock.postsCount()).thenReturn(25);
        when(statisticsMock.commentsCount()).thenReturn(50);
        forumStatistics = new ForumStatistics(statisticsMock);
    }

    @After
    public void afterTest() {
        System.out.println("users number: " + forumStatistics.getUserQuantity());
        System.out.println("posts number: " + forumStatistics.getPostsQuantity());
        System.out.println("comments number: " + forumStatistics.getCommentsQuantity());

        System.out.println(" average comments per user " + forumStatistics.getAvgCommentsPerUser());
        System.out.println(" average comments per post " + forumStatistics.getAvgCommentsPerPost());
        System.out.println(" average posts per user " + forumStatistics.getAvgPostsPerUser());
    }

    @Test
    public void testCalculateAdvStatistics100Users() {
        //Given
        List<String> usersNamesMock = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNamesMock.add("John Smith" + i);
        }
        //When
        when(statisticsMock.usersNames()).thenReturn(usersNamesMock);
        forumStatistics.calculateAdvStatistics();

        //Then
        Assert.assertEquals(100, forumStatistics.getUserQuantity());
        Assert.assertEquals(0.50, forumStatistics.getAvgCommentsPerUser(), 0.01);
        Assert.assertEquals(0.25, forumStatistics.getAvgPostsPerUser(), 0.01);
        Assert.assertEquals(2.0, forumStatistics.getAvgCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsNoUsers() {
        //Given
        List<String> usersNamesMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersNamesMock);
        //When
        forumStatistics.calculateAdvStatistics();
        //Then
        Assert.assertEquals(0, forumStatistics.getUserQuantity());
        Assert.assertEquals(0, forumStatistics.getAvgCommentsPerUser(), 0.01);
        Assert.assertEquals(0, forumStatistics.getAvgPostsPerUser(), 0.01);
        Assert.assertEquals(2.0, forumStatistics.getAvgCommentsPerPost(), 0.01);

    }

    @Test
    public void testCalculateAdvStatisticsNoPosts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics();
        //Then
        Assert.assertEquals(0, forumStatistics.getPostsQuantity());
        Assert.assertEquals(0.62, forumStatistics.getAvgCommentsPerUser(), 0.01);
        Assert.assertEquals(0, forumStatistics.getAvgPostsPerUser(), 0.01);
        Assert.assertEquals(0, forumStatistics.getAvgCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsNoComments() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics();
        //Then
        Assert.assertEquals(0, forumStatistics.getCommentsQuantity());
        Assert.assertEquals(0, forumStatistics.getAvgCommentsPerUser(), 0.01);
        Assert.assertEquals(0.31, forumStatistics.getAvgPostsPerUser(), 0.01);
        Assert.assertEquals(0, forumStatistics.getAvgCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsCommentsLessThenPosts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);
        //When
        forumStatistics.calculateAdvStatistics();
        boolean result = forumStatistics.getPostsQuantity() > forumStatistics.getCommentsQuantity();
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0.12, forumStatistics.getAvgCommentsPerUser(), 0.01);
        Assert.assertEquals(1.25, forumStatistics.getAvgPostsPerUser(), 0.01);
        Assert.assertEquals(0.1, forumStatistics.getAvgCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsCommentsMoreThenPosts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(150);
        //When
        forumStatistics.calculateAdvStatistics();
        boolean result = forumStatistics.getPostsQuantity() < forumStatistics.getCommentsQuantity();
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(1.87, forumStatistics.getAvgCommentsPerUser(), 0.01);
        Assert.assertEquals(1.25, forumStatistics.getAvgPostsPerUser(), 0.01);
        Assert.assertEquals(1.5, forumStatistics.getAvgCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatistics1000Posts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics();
        //Then
        Assert.assertEquals(1000, forumStatistics.getPostsQuantity());
        Assert.assertEquals(0.62, forumStatistics.getAvgCommentsPerUser(), 0.01);
        Assert.assertEquals(12.5, forumStatistics.getAvgPostsPerUser(), 0.01);
        Assert.assertEquals(0.05, forumStatistics.getAvgCommentsPerPost(), 0.01);
    }
}
