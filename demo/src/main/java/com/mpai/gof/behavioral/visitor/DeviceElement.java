package com.mpai.gof.behavioral.visitor;

public interface DeviceElement {
    String accept(DeviceVisitor v);
}
