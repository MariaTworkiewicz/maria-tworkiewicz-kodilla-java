package com.kodilla.stream.array;

import org.junit.Test;

import java.util.OptionalDouble;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;

        //When
        double newAverage = getAverage(array);
        System.out.println(newAverage);

    }
}
