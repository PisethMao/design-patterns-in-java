package com.piseth.patterns.structural.flyweight.drawingexample;

public class Main {
    public static void main() {
        Forest forest = new Forest();
        forest.plantTree(10, 20, "Oak", "Brown", "Hard");
        forest.plantTree(30, 40, "Pine", "Green", "Soft");
        forest.plantTree(50, 60, "Oak", "Brown", "Hard");
        forest.plantTree(70, 80, "Pine", "Green", "Soft");
        forest.draw();
        IO.println("Number of trees: " + forest.getNumberOfTrees());
        IO.println("Number of tree types: " + TreeTypeFactory.getNumberOfTreeTypes());
    }
}
