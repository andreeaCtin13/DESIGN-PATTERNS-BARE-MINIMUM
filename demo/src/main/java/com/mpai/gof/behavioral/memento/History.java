package com.mpai.gof.behavioral.memento;

import com.mpai.gof.behavioral.memento.ThermostatStateful;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private final Deque<ThermostatStateful.Memento> stack = new ArrayDeque<>();

    public void push(ThermostatStateful.Memento m) { stack.push(m); }
    public ThermostatStateful.Memento pop() { return stack.pop(); }
}
