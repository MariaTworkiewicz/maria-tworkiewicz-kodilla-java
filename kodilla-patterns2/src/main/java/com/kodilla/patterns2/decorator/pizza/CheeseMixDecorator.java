package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CheeseMixDecorator extends AbstractPizzaDecorator {
    protected CheeseMixDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + additional mix of cheese";
    }
}
