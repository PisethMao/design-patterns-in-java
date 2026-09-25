package com.piseth.patterns.structural.proxy.lazyproxy.uploadimageexample;

public class LazyImageProxy implements Image {
    private final String fileName;
    private RealImage realImage;

    public LazyImageProxy(String fileName) {
        this.fileName = fileName;

        IO.println(
                "[PROXY] Proxy created for: " + fileName
        );
    }

    @Override
    public void display() {
        if (realImage == null) {
            IO.println(
                    "[PROXY] Real image does not exist yet."
            );
            IO.println(
                    "[PROXY] Creating RealImage..."
            );
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
