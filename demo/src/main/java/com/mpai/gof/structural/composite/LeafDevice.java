package com.mpai.gof.structural.composite;

public class LeafDevice implements Node {
    private final String name;
    public LeafDevice(String name){ this.name = name; }
    public String operation(){ return "Device(" + name + ")"; }
}
