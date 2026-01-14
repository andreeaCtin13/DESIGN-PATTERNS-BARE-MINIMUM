package com.mpai.gof.behavioral.visitor;

import java.util.List;

public class VisitorDemo {
    public static String run() {
        var elements = List.of(new LightElement(), new ThermostatElement());
        var v = new DiagnosticsVisitor();
        return elements.stream().map(e -> e.accept(v)).toList().toString();
    }
}
