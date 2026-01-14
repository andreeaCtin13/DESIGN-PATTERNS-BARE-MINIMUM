package com.mpai.gof.behavioral.interpreter;

import java.util.Map;

public class InterpreterDemo {
    public static String run() {
        // Expresie: ON AND NOT OFF
        Expression expr = new And(new Var("ON"), new Not(new Var("OFF")));
        Context ctx = new Context(Map.of("ON", true, "OFF", false));
        return "result=" + expr.interpret(ctx);
    }
}
