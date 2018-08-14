package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        //Logger logger = new Logger();
        //When
        Logger.getInstance().log("added new line of log");
        String testedLog = Logger.getInstance().getLastLog();
        //then
        Assert.assertEquals("added new line of log", testedLog);

    }
}
