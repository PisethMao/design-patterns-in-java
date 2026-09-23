package com.piseth.patterns.creational.builder.classicgofbuilder.houseexample;

public class House {
    private String foundation;
    private String walls;
    private String roof;
    private Boolean isGarage;
    private Boolean isSwimmingPool;

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setIsGarage(Boolean isGarage) {
        this.isGarage = isGarage;
    }

    public void setIsSwimmingPool(Boolean isSwimmingPool) {
        this.isSwimmingPool = isSwimmingPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                ", garage='" + isGarage + '\'' +
                ", swimmingPool='" + isSwimmingPool + '\'' +
                '}';
    }
}
