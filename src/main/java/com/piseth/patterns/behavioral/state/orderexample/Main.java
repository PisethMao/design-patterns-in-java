package com.piseth.patterns.behavioral.state.orderexample;

public class Main {
    public static void main(){
        Order order = new Order();
        IO.println(order.getStatus());
        order.pay();
        IO.println(order.getStatus());
        order.ship();
        IO.println(order.getStatus());
        order.deliver();
        IO.println(order.getStatus());
    }
}
