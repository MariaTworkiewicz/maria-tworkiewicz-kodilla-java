package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;
import java.util.Map;

public interface FoodProducer {
    void process(Customer customer, Map<Product, Integer> orderedProducts);
}
