package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {


    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        //Integer tempNumber;

        for (Integer item : numbers) {
            if (item % 2 == 0) {
                result.add(item);
            }
        }
        String evenNumbers = "";
        for (Integer item : result) {
            evenNumbers += item + ", ";
        }
        //System.out.println("Even numbers = " + evenNumbers);
        return result;
    }
}
