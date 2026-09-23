package com.piseth.patterns.structural.bridge.remoteexample;

public class Projector implements Device {
    private Boolean hasEnabled = false;
    private Integer volume;

    @Override
    public Boolean isEnabled() {
        return hasEnabled;
    }

    @Override
    public void enable() {
        hasEnabled = true;
        IO.println("Projector is turned on");
    }

    @Override
    public void disable() {
        hasEnabled = false;
        IO.println("Projector is turned off");
    }

    @Override
    public Integer getVolume() {
        return volume;
    }

    @Override
    public void setVolume(Integer volume) {
        if (volume < 0) {
            volume = 0;
        }
        if (volume > 100) {
            volume = 100;
        }
        this.volume = volume;
        IO.println("Projector volume is set to " + volume);
    }
}
