package com.example.euclidean_algorithm;

public class EuclideanAlgorithm {
    private int x;
    private int y;

    public EuclideanAlgorithm(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int greatestCommonDivisor(){
        while(x != y) {
            if(x > y) {
                x -= y;
            }
            else {
                y -= x;
            }
        } return x;
    }
}
