package com.piseth.patterns.structural.proxy.lazyproxy.uploadimageexample;

public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        IO.println(
                "[REAL IMAGE] Loading image from disk: " + fileName
        );
    }

    @Override
    public void display() {
        IO.println(
                "[REAL IMAGE] Displaying image: " + fileName
        );
    }
}
