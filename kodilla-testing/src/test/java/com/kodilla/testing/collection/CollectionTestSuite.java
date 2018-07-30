package com.kodilla.testing.collection;


import org.junit.*;

import java.util.*;


public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: begin");
    }

    @After
    public void after() {
        System.out.println("Test case: end ");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<Integer>();
        List<Integer> expectedList = new ArrayList<Integer>();
        //When
        OddNumbersExterminator emptyListResult = new OddNumbersExterminator();
        List<Integer> actualList = emptyListResult.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assert.assertTrue(actualList.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> normalList = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++) {
            normalList.add(i);
        }

        List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(6);
        expectedList.add(8);

        //When
        OddNumbersExterminator normalListResult = new OddNumbersExterminator();
        List<Integer> actualList = normalListResult.exterminate(normalList);
        System.out.println("Testing normal list");
        //Then
        Assert.assertEquals(actualList, expectedList);
    }
}
