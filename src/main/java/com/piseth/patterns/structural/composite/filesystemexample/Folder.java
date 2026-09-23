package com.piseth.patterns.structural.composite.filesystemexample;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private final String name;
    private final List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addChild(FileSystemComponent component) {
        children.add(component);
    }

    public void removeChild(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void show() {
        IO.println("Folder: " + name);
        for (FileSystemComponent child : children) {
            child.show();
        }
    }

    @Override
    public Long getSize() {
        Long total = 0L;
        for(FileSystemComponent component : children){
            total += component.getSize();
        }
        return total;
    }
}
