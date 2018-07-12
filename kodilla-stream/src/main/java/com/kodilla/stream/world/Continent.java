package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final String continentName;
    private List<Country> continent= new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;

    }

    public void addCountry(Country country){
        continent.add(country);
    }

    public List<Country> getContinent() {
        return continent;
    }

}
