package com.piseth.patterns.structural.bridge.remoteexample;

public interface Device {
    Boolean isEnabled();

    void enable();

    void disable();

    Integer getVolume();

    void setVolume(Integer volume);
}
