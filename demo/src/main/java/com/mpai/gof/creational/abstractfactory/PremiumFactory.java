package com.mpai.gof.creational.abstractfactory;

public class PremiumFactory implements SmartHomeFactory {
    public SmartLight createLight() { return new PremiumLight(); }
    public SmartThermostat createThermostat() { return new PremiumThermostat(); }
}
