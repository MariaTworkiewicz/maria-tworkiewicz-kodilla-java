package com.kodilla.good.patterns.challenges.allegro;

public class ProductOrderRunner {
    public static void main(String[] args) {
        User user1 = new User("malaAnia", "Anna", "Kowalska");
        Product maslo = new Product("maslo", "maslo prosto od krowy", 5.0);

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(), new ShoesOrderService(),
                new ShoesOrderRepository());
        productOrderProcessor.process(orderRequest);

    }
}
