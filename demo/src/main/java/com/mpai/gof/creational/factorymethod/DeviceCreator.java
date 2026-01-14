package com.mpai.gof.creational.factorymethod;

/**
 * Creatorul definește factory method-ul.
 * Poate conține logică comună (ex: logare, validare) înainte/după creare.
 */
public abstract class DeviceCreator {

    /** Factory Method: subclasele decid CE produs concret creează. */
    protected abstract Device createDevice();

    public String startDevice() {
        Device d = createDevice();
        return "Creator a pornit: " + d.turnOn();
    }
}
