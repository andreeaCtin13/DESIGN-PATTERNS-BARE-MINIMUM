package com.mpai.gof.behavioral.observer;

public class ObserverDemo {
    public static String run() {
        ThermostatSubject s = new ThermostatSubject();
        DisplayObserver d = new DisplayObserver();
        s.add(d);

        s.setTemp(21);
        s.setTemp(23);

        return "subject=" + s.getTemp() + ", observerLast=" + d.last();
    }
}

