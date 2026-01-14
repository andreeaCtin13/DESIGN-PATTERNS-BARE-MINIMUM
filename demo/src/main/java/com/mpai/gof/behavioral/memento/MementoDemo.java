package com.mpai.gof.behavioral.memento;

public class MementoDemo {
    public static String run() {
        ThermostatStateful t = new ThermostatStateful(22);
        History h = new History();
        h.push(t.save());       // salvează 22
        t.setTemperature(25);   // schimbă
        t.restore(h.pop());     // revine la 22

        return "temp=" + t.getTemperature();
    }
}
