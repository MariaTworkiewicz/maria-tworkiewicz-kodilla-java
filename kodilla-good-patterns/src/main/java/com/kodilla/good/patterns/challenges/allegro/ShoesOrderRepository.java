package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class ShoesOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(User user, Product product, LocalDateTime orderDate) {
        return true;
    }
}
