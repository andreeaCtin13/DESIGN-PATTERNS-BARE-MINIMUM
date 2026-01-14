package com.mpai.gof.behavioral.visitor;

public class LightElement implements DeviceElement {
    public String accept(DeviceVisitor v){ return v.visit(this); }
    public int watts(){ return 9; }
}