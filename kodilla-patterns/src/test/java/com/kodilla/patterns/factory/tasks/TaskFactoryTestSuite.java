package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        boolean before = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        //then
        Assert.assertEquals("Weekend trip", drivingTask.getTaskName());
        Assert.assertFalse(before);
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        boolean before = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        //then
        Assert.assertEquals("Family room' painting", paintingTask.getTaskName());
        Assert.assertFalse(before);
        Assert.assertTrue(paintingTask.isTaskExecuted());

    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        boolean before = shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        //then
        Assert.assertEquals("kids back-to-school clothes", shoppingTask.getTaskName());
        Assert.assertFalse(before);
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }
}
