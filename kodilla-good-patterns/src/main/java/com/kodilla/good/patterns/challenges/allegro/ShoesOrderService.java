package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class ShoesOrderService implements OrderService {
    @Override
    public boolean order(User user, LocalDateTime orderDate, Product product, int quantity) {
        return true;
    }
}
