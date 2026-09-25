package com.piseth.patterns.behavioral.command.lightexample;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command == null) {
            IO.println("No command configured");
            return;
        }
        command.execute();
    }
}
