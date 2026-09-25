package com.piseth.patterns.behavioral.command.lightexample;

public class Main {
    public static void main() {
        Light light = new Light();
        Command turnOn = new TurnOnLightCommand(light);
        Command turnOff = new TurnOffLightCommand(light);
        RemoteControl remote = new RemoteControl();
        remote.setCommand(turnOn);
        remote.pressButton();
        remote.setCommand(turnOff);
        remote.pressButton();
    }
}
