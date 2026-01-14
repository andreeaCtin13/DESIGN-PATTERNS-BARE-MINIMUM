package com.mpai.gof.behavioral.visitor;

public class DiagnosticsVisitor implements DeviceVisitor {
    public String visit(LightElement l){ return "Light diag: watts=" + l.watts(); }
    public String visit(ThermostatElement t){ return "Thermo diag: target=" + t.targetTemp(); }
}
