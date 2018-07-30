package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements FoodProducer {
    private Map<Product, Integer> productAvailabilityList;

    public ExtraFoodShop() {
        productAvailabilityList = createProductList();
    }

    private Map<Product, Integer> createProductList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new Product("kasza", 1.50), 40);
        productsList.put(new Product("mąka", 3.20), 5);
        productsList.put(new Product("płatki owsiane", 3.0), 30);
        productsList.put(new Product("kukurydza", 6), 70);

        return productsList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {

       /* for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()){
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Extra Food Shop: We're sorry. Product is unavailable.");
                return false;
            }
        }
        return true;*/
    }

    @Override
    public void process(Customer customer, Map<Product, Integer> orderedProducts) {


    }
}
