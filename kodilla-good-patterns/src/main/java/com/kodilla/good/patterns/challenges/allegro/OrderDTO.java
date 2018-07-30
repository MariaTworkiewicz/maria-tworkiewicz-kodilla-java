package com.kodilla.good.patterns.challenges.allegro;

public class OrderDTO {
    public User user;
    public Product product;
    public int quantity;
    public boolean isSold;

    public OrderDTO(User user, Product product, int quantity, boolean isSold) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isSold() {
        return isSold;
    }
}
