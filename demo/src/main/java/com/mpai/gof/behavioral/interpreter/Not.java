package com.mpai.gof.behavioral.interpreter;

public record Not(Expression inner) implements Expression {
    public boolean interpret(Context ctx){ return !inner.interpret(ctx); }
}
