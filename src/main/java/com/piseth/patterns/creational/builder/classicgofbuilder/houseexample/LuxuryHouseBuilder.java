package com.piseth.patterns.creational.builder.classicgofbuilder.houseexample;

public class LuxuryHouseBuilder implements HouseBuilder{
    private final House house = new House();
    @Override
    public void buildFoundation() {
        house.setFoundation("Reinforced Concrete Foundation");
    }

    @Override
    public void buildWalls() {
        house.setWalls("Premium Stone Walls");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Premium Tile Roof");
    }

    @Override
    public void buildGarage() {
        house.setIsGarage(true);
    }

    @Override
    public void buildSwimmingPool() {
        house.setIsSwimmingPool(true);
    }

    @Override
    public House getResult() {
        return house;
    }
}
