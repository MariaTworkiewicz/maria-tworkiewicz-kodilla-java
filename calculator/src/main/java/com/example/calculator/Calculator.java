package com.example.calculator;

public class Calculator {

    private double x;
    private double y;

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double add() {
        return x + y;
    }

    public double subtract() {
        return x - y;
    }
}
