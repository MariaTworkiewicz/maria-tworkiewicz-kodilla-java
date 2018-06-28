package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Testing SimpleUser");
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //test for Calculator class
        System.out.println("Testing Calculator");
        Calculator calculator = new Calculator(5, 3);
        int addResult = calculator.add();
        int subtractResult = calculator.subtract();

        if(addResult == 8 && subtractResult == 2){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
