package com.mpai.gof.behavioral.observer;

public class DisplayObserver implements Observer {
    private int last;
    @Override public void update(int newTemp){ last = newTemp; }
    public int last(){ return last; }
}
