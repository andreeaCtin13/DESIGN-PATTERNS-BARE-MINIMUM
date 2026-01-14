package com.mpai.gof.behavioral.visitor;

/**
 * Visitor: câte o metodă per tip concret.
 * Când adaugi un element nou, adaugi și o metodă nouă în visitor.
 */
public interface DeviceVisitor {
    String visit(LightElement l);
    String visit(ThermostatElement t);
}
