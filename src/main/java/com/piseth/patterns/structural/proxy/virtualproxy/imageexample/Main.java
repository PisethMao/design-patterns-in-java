package com.piseth.patterns.structural.proxy.virtualproxy.imageexample;

public class Main {
    public static void main() {
        Image image = new ImageProxy("large_image.jpg");
        IO.println("Object Image Created");
        IO.println("User Opened Image");
        image.display();
    }
}
