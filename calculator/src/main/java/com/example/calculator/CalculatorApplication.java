package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);

        Calculator liczydlo = new Calculator(30, 6);

        System.out.println(liczydlo.add());
        System.out.println(liczydlo.subtract());
    }


}
