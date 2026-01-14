package com.mpai.gof.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/** Subject */
public class ThermostatSubject {
    private final List<Observer> observers = new ArrayList<>();
    private int temp;

    public void add(Observer o){ observers.add(o); }
    public void setTemp(int t){
        this.temp = t;
        // notificare automată
        observers.forEach(o -> o.update(t));
    }
    public int getTemp(){ return temp; }
}
