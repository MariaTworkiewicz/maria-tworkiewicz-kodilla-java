package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
           String result = secondChallenge.probablyIWillThrowException(3, 5);
           System.out.println(result);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        } finally {
            System.out.println("error handled properly,proceeding with next operations");
        }
    }
}
