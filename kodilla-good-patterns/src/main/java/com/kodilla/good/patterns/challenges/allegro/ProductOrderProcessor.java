package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class ProductOrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderProcessor(final InformationService informationService,
                                 final OrderService orderService,
                                 final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO process(final OrderRequest orderRequest){
        boolean isSold = orderService.order(orderRequest.getUser(), orderRequest.getOrderDate(), orderRequest.getProduct(), orderRequest.getQuantity());
        if(isSold){
            informationService.inform(orderRequest.getUser(), orderRequest.getProduct());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity(), false);
        }
    }
}
