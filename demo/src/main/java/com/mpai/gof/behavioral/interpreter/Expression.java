package com.mpai.gof.behavioral.interpreter;

/** Expression: nod în arborele de interpretare */
public interface Expression {
    boolean interpret(Context ctx);
}
