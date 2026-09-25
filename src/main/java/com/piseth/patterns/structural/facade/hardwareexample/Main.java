package com.piseth.patterns.structural.facade.hardwareexample;

public class Main {
    public static void main() {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();
        IO.println("Main method completed");
    }
}
