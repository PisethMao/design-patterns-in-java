package com.piseth.patterns.structural.bridge.remoteexample;

public class Radio implements Device {
    private Boolean hasEnabled = false;
    private Integer volume = 20;

    @Override
    public Boolean isEnabled() {
        return hasEnabled;
    }

    @Override
    public void enable() {
        hasEnabled = true;
        IO.println("Radio is turned on");
    }

    @Override
    public void disable() {
        hasEnabled = false;
        IO.println("Radio is turned off");
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
        IO.println("Radio volume is set to " + volume);
    }
}
