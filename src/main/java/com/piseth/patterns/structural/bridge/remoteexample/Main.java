package com.piseth.patterns.structural.bridge.remoteexample;

public class Main {
    static void main() {
        Device tv = new TV();
        RemoteControl tvRemote = new RemoteControl(tv);
        tvRemote.togglePower();
        tvRemote.volumeUp();
        tvRemote.volumeUp();
        IO.println("----------------");
        Device radio = new Radio();
        AdvancedRemoteControl radioRemote = new AdvancedRemoteControl(radio);
        radioRemote.togglePower();
        radioRemote.volumeUp();
        radioRemote.mute();
        IO.println("----------------");
        Device projector = new Projector();
        AdvancedRemoteControl projectorRemote = new AdvancedRemoteControl(projector);
        IO.println(projectorRemote);
        IO.println("----------------");
    }
}
