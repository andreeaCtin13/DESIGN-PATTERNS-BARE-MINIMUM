package com.mpai.gof.structural.bridge;

public class BasicRemote extends RemoteControl {
    public BasicRemote(DeviceApi api){ super(api); }

    @Override public String toggle(boolean on) {
        return on ? api.powerOn() : api.powerOff();
    }
}
