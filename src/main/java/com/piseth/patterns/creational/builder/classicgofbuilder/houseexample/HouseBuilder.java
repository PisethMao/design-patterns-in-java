package com.piseth.patterns.creational.builder.classicgofbuilder.houseexample;

public interface HouseBuilder {
    void buildFoundation();
    void buildWalls();
    void buildRoof();
    void buildGarage();
    void buildSwimmingPool();
    House getResult();
}
