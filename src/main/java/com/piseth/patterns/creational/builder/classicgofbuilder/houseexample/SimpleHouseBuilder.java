package com.piseth.patterns.creational.builder.classicgofbuilder.houseexample;

public class SimpleHouseBuilder implements HouseBuilder {
    private final House house = new House();

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete Foundation");
    }

    @Override
    public void buildWalls() {
        house.setWalls("Brick Walls");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Standard Roof");
    }

    @Override
    public void buildGarage() {
        house.setIsGarage(false);
    }

    @Override
    public void buildSwimmingPool() {
        house.setIsSwimmingPool(false);
    }

    @Override
    public House getResult() {
        return house;
    }
}
