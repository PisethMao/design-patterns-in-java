package com.piseth.patterns.structural.composite.filesystemexample;

public class File implements FileSystemComponent{
    private final String name;
    private final Long size;

    public File(String name, Long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void show() {
        IO.println("\tFile: " + name);
    }

    @Override
    public Long getSize() {
        return size;
    }
}
