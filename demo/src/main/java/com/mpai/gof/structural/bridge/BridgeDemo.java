package com.mpai.gof.structural.bridge;

public class BridgeDemo {
    public static String run() {
        RemoteControl r1 = new BasicRemote(new TvApi());
        RemoteControl r2 = new BasicRemote(new SpeakerApi());
        return r1.toggle(true) + " | " + r2.toggle(true);
    }
}
