package com.mpai.gof.behavioral.command;

public class CommandDemo {
    public static String run() {
        LightReceiver light = new LightReceiver();
        RemoteInvoker inv = new RemoteInvoker();
        inv.add(new TurnOnLightCommand(light));
        inv.add(new TurnOffLightCommand(light));
        return inv.runAll();
    }
}
