package com.piseth.patterns.creational.builder.classicgofbuilder.houseexample;

public class HouseDirector {
    public void constructHouse(HouseBuilder houseBuilder) {
        houseBuilder.buildFoundation();
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        houseBuilder.buildGarage();
        houseBuilder.buildSwimmingPool();
    }
}
