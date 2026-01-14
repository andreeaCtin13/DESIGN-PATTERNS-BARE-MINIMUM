package com.mpai.gof.behavioral.interpreter;

import java.util.Map;

/** Context: variabilele disponibile */
public record Context(Map<String, Boolean> vars) {
    public boolean get(String name){ return vars.getOrDefault(name, false); }
}
