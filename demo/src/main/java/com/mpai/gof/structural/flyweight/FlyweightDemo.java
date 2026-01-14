package com.mpai.gof.structural.flyweight;

public class FlyweightDemo {
    public static String run() {
        DeviceModelFactory f = new DeviceModelFactory();
        var m1 = f.get("THERMO_X");
        var m2 = f.get("THERMO_X");
        var m3 = f.get("LIGHT_A");

        // m1 și m2 sunt același obiect (același flyweight), m3 diferit.
        return "sameRef=" + (m1 == m2) + ", cacheSize=" + f.cacheSize();
    }
}
