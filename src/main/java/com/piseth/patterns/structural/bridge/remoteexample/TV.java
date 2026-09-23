package com.piseth.patterns.structural.bridge.remoteexample;

public class TV implements Device {
    private Boolean hasEnabled = false;
    private Integer volume = 30;

    @Override
    public Boolean isEnabled() {
        return hasEnabled;
    }

    @Override
    public void enable() {
        hasEnabled = true;
        IO.println("TV is turned on");
    }

    @Override
    public void disable() {
        hasEnabled = false;
        IO.println("TV is turned off");
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
        IO.println("TV volume is set to " + volume);
    }
}
