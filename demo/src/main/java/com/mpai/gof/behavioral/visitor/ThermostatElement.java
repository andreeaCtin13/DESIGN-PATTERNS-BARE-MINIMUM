package com.mpai.gof.behavioral.visitor;

public class ThermostatElement implements DeviceElement {
    public String accept(DeviceVisitor v){ return v.visit(this); }
    public int targetTemp(){ return 22; }
}