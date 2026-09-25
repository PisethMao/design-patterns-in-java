package com.piseth.patterns.structural.facade.hardwareexample;

public class ComputerFacade {
    private final CPU cpu = new CPU();
    private final Memory memory = new Memory();
    private final HardDrive hardDrive = new HardDrive();

    public void start() {
        cpu.start();
        memory.load();
        hardDrive.read();
        IO.println("Computer started");
    }
}
