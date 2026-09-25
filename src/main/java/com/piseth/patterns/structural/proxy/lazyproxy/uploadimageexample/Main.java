package com.piseth.patterns.structural.proxy.lazyproxy.uploadimageexample;

public class Main {
    public static void main() {
        Image image = new LazyImageProxy("profile.png");
        IO.println("\n--- First call ---");
        image.display();
        IO.println("\n--- Second call ---");
        image.display();
        IO.println("\n--- Third call ---");
        image.display();
    }
}
