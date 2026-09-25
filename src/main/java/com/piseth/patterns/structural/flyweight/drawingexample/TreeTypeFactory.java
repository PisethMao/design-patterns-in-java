package com.piseth.patterns.structural.flyweight.drawingexample;

import java.util.HashMap;
import java.util.Map;

public final class TreeTypeFactory {
    private static final Map<String, TreeType> treeTypeMap = new HashMap<>();

    private TreeTypeFactory() {}

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + color + texture;
        TreeType treeType = treeTypeMap.get(key);
        if (treeType == null) {
            treeType = new TreeType(name, color, texture);
            treeTypeMap.put(key, treeType);
            IO.println("Creating new ThreeType: " + name + " with color " + color + " and texture " + texture);
        }
        return treeType;
    }

    public static int getNumberOfTreeTypes() {
        return treeTypeMap.size();
    }
}
