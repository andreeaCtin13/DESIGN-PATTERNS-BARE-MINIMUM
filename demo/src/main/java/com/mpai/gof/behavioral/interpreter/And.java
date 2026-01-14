package com.mpai.gof.behavioral.interpreter;

public record And(Expression left, Expression right) implements Expression {
    public boolean interpret(Context ctx){ return left.interpret(ctx) && right.interpret(ctx); }
}