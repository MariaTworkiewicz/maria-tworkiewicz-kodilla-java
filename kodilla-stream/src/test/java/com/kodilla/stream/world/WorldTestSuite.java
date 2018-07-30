package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        //Countries
        Country poland = new Country("Poland", new BigDecimal("79785435430339948574"));
        Country russia = new Country("Russia", new BigDecimal("7548450854736544444"));
        Country germany = new Country("Germany", new BigDecimal("5749372584037584484"));

        Country india = new Country("India", new BigDecimal("58437584375894378544"));
        Country pakistan = new Country("Pakistan", new BigDecimal("66435435488978978"));
        Country china = new Country("China", new BigDecimal("7853947584397584397584"));

        Country equador = new Country("Equador", new BigDecimal("97686576565464565"));
        Country peru = new Country("Peru", new BigDecimal("54532543543543544454"));
        Country mexico = new Country("Mexico", new BigDecimal("96437023473892749"));

        //Continents
        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(russia);
        europe.addCountry(germany);

        Continent asia = new Continent("Asia");
        asia.addCountry(india);
        asia.addCountry(pakistan);
        asia.addCountry(china);

        Continent southAmerica = new Continent("South America");
        southAmerica.addCountry(equador);
        southAmerica.addCountry(peru);
        southAmerica.addCountry(mexico);

        //World
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(southAmerica);

        //When
        BigDecimal totalPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("8060261530221664734376");
        Assert.assertEquals(expectedPopulation, totalPopulation);
    }
}
