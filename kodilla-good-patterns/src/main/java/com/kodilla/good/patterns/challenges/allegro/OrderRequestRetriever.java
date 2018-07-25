package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("malaAnia", "Anna", "Kowalska");
        LocalDateTime orderDate = LocalDateTime.of(2018, 6, 24, 12, 20);
        Product shoes = new Product("stilletto", "high heel shoes", 123.0);
        return new OrderRequest(user, orderDate,shoes, 123,1 );
    }
}
