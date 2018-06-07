package com.example.euclidean_algorithm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EuclideanAlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(EuclideanAlgorithmApplication.class, args);

        EuclideanAlgorithm example1 = new EuclideanAlgorithm(60, 20);
        EuclideanAlgorithm example2 = new EuclideanAlgorithm(15, 100);
        EuclideanAlgorithm example3 = new EuclideanAlgorithm(1122, 867);
        EuclideanAlgorithm example4 = new EuclideanAlgorithm(867, 1122);

        System.out.println(example1.greatestCommonDivisor());
        System.out.println(example2.greatestCommonDivisor());
        System.out.println(example3.greatestCommonDivisor());
        System.out.println(example4.greatestCommonDivisor());
    }
}
