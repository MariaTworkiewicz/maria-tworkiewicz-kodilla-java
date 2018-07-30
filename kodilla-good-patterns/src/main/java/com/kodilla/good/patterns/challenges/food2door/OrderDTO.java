package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;
import java.util.Map;

public class OrderDTO {
    public Customer customer;
    public Map<Product, Integer> orderedProducts;
    public boolean isOrdered;

    public OrderDTO(Customer customer, Map<Product, Integer> orderedProducts, boolean isOrdered) {
        this.customer = customer;
        this.orderedProducts = orderedProducts;
        this.isOrdered = isOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getOrderedProducts() {
        return orderedProducts;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
