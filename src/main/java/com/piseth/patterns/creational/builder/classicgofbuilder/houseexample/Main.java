package com.piseth.patterns.creational.builder.classicgofbuilder.houseexample;

public class Main {
    void main() {
        HouseDirector director = new HouseDirector();
        HouseBuilder simpleHouseBuilder = new SimpleHouseBuilder();
        director.constructHouse(simpleHouseBuilder);
        House simpleHouse = simpleHouseBuilder.getResult();
        System.out.println(simpleHouse);

        HouseBuilder luxuryHouseBuilder = new LuxuryHouseBuilder();
        director.constructHouse(luxuryHouseBuilder);
        House luxuryHouse = luxuryHouseBuilder.getResult();
        System.out.println(luxuryHouse);
    }
}
