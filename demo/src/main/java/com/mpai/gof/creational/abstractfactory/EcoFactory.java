package com.mpai.gof.creational.abstractfactory;

public class EcoFactory implements SmartHomeFactory {
    public SmartLight createLight() { return new EcoLight(); }
    public SmartThermostat createThermostat() { return new EcoThermostat(); }
}
