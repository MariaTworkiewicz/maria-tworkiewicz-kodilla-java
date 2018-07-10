package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class World {
    List<Continent> world = new ArrayList<>();

    public World() {
    }


    public void addContinent(Continent continent){
        world.add(continent);

    }

    public List<Continent> getWorld(){
        return world;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal totalPopulation;
       totalPopulation = world.stream()
                .flatMap(region -> region.getContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalPopulation;
    }
}
