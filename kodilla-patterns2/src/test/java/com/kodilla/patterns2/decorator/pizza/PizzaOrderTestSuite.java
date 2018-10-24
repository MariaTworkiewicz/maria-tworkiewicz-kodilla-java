package com.kodilla.patterns2.decorator.pizza;


import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaGetCost() {
        //Given
        Pizza pizza = new BasicPizza();

        //When
        BigDecimal calculatedCost = pizza.getCost();

        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        //Given
        Pizza pizza = new BasicPizza();
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Basic pizza (dough + tomato sauce + cheese", description);
    }

    @Test
    public void testMushroomPizzaGetCost(){
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new MushroomPizzaDecorator(pizza);
        //When
        BigDecimal calculatedCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(17), calculatedCost);

    }

    @Test
    public void testMushroomPizzaGetDescription(){
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new MushroomPizzaDecorator(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Basic pizza (dough + tomato sauce + cheese + mushrooms", description);
    }

    @Test
    public void testMushroomOnionsPizzaGetCost(){
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new MushroomPizzaDecorator(pizza);
        pizza = new OnionsPizzaDecorator(pizza);
        //When
        BigDecimal calculatedCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(22), calculatedCost);

    }

    @Test
    public void testMushroomOnionsPizzaGetDescription(){
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new MushroomPizzaDecorator(pizza);
        pizza = new OnionsPizzaDecorator(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Basic pizza (dough + tomato sauce + cheese + mushrooms + onions", description);
    }

    @Test
    public void testMushroomOnionsOlivesPizzaGetCost(){
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new MushroomPizzaDecorator(pizza);
        pizza = new OnionsPizzaDecorator(pizza);
        pizza = new OlivesPizzaDecorator(pizza);
        //When
        BigDecimal calculatedCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(25), calculatedCost);

    }

    @Test
    public void testMushroomOnionsOlivesPizzaGetDescription(){
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new MushroomPizzaDecorator(pizza);
        pizza = new OnionsPizzaDecorator(pizza);
        pizza = new OlivesPizzaDecorator(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Basic pizza (dough + tomato sauce + cheese + mushrooms + onions + olives", description);

    }

    @Test
    public void testMushroomOnionsOlivesMozzarellaSpeedyDeliveryPizzaGetCost(){
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new MushroomPizzaDecorator(pizza);
        pizza = new OnionsPizzaDecorator(pizza);
        pizza = new OlivesPizzaDecorator(pizza);
        pizza = new SpeedyDeliveryDecorator(pizza);
        //When
        BigDecimal calculatedCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(35), calculatedCost);

    }

    @Test
    public void testMushroomOnionsOlivesMozzarellaSpeedyDeliveryPizzaGetDescription(){
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new MushroomPizzaDecorator(pizza);
        pizza = new OnionsPizzaDecorator(pizza);
        pizza = new OlivesPizzaDecorator(pizza);
        pizza = new SpeedyDeliveryDecorator(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Basic pizza (dough + tomato sauce + cheese + mushrooms + onions + olives + speedy delivery", description);

    }
}

