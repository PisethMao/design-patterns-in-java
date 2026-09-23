package com.piseth.patterns.structural.bridge.remoteexample;

public class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
        IO.println("Device muted");
    }
}
