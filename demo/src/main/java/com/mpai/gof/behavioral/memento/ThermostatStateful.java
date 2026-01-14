package com.mpai.gof.behavioral.memento;

public class ThermostatStateful {
    private int temperature;

    public ThermostatStateful(int temperature) {
        this.temperature = temperature;
    }

    public void setTemperature(int t) { this.temperature = t; }
    public int getTemperature() { return temperature; }

    // Caretaker poate ține asta, dar NU poate construi stări
    public interface Memento {}

    // Implementarea reală e ascunsă complet
    private record Snapshot(int temperature) implements Memento {}

    public Memento save() {
        return new Snapshot(temperature);
    }

    public void restore(Memento m) {
        Snapshot s = (Snapshot) m; // safe dacă m vine din save()
        this.temperature = s.temperature();
    }
}
