package com.mpai.gof.structural.bridge;

/**
 * Abstracția "RemoteControl" folosește o implementare (DeviceApi).
 * Putem schimba DeviceApi fără să schimbăm remote-urile și invers.
 */
public abstract class RemoteControl {
    protected final DeviceApi api;
    protected RemoteControl(DeviceApi api){ this.api = api; }

    public abstract String toggle(boolean on);
}
