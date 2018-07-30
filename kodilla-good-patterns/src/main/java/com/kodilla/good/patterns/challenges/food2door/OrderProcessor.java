package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    private InformationService informationService;
    private OrderPreparation orderPreparation;

    public OrderProcessor(InformationService informationService, OrderPreparation orderPreparation) {
        this.informationService = informationService;
        this.orderPreparation = orderPreparation;
    }

    public OrderDTO process(final OrderRequest orderRequest) {
        boolean isSold = orderPreparation.prepareOrder(orderRequest.getCustomer(), orderRequest.getFoodProducer());
        if (isSold) {
            informationService.inform(orderRequest.getCustomer(), orderRequest);

            return new OrderDTO(orderRequest.getCustomer(), orderRequest.getOrderedProducts(), true);
        } else {
            return new OrderDTO(orderRequest.getCustomer(), orderRequest.getOrderedProducts(), false);
        }
    }
}
