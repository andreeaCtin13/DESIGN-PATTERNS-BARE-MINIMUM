package com.mpai.gof.structural.composite;

public class CompositeDemo {
    public static String run() {
        Room home = new Room("Home");
        Room living = new Room("Living");
        living.add(new LeafDevice("TV"));
        living.add(new LeafDevice("Lamp"));

        home.add(living);
        home.add(new LeafDevice("Thermostat"));

        return home.operation();
    }
}
