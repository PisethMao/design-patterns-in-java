package com.piseth.patterns.structural.proxy.virtualproxy.imageexample;

public class RealImage implements Image {
    private final String fileName;

    private void loadImage() {
        IO.println("Loading Large Image From Disk: " + fileName);
    }

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImage();
    }

    @Override
    public void display() {
        IO.println("Displaying Large Image From Disk: " + fileName);
    }
}
