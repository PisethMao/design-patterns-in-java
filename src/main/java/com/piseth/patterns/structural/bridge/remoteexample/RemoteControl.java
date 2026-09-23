package com.piseth.patterns.structural.bridge.remoteexample;

public class RemoteControl {
    protected final Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeUp() {
        Integer currentVolume = device.getVolume();
        device.setVolume(currentVolume + 10);
    }

    public void volumeDown() {
        Integer currentVolume = device.getVolume();
        device.setVolume(currentVolume - 10);
    }
}
