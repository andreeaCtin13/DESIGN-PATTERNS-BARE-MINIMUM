package com.mpai.gof.behavioral.interpreter;

public record Var(String name) implements Expression {
    public boolean interpret(Context ctx){ return ctx.get(name); }
}