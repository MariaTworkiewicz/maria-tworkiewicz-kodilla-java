package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //test for Calculator class
        Calculator calculator = new Calculator(5, 3);
        System.out.println(calculator.getA() + " + " + calculator.getB() + " = " + calculator.add());
        System.out.println(calculator.getA() + " - " + calculator.getB() + " = " + calculator.subtract());

    }
}
