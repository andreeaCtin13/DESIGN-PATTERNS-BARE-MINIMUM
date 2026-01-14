package com.mpai.gof.creational.abstractfactory;

public class AbstractFactoryDemo {
    public static String run() {
        SmartHomeFactory eco = new EcoFactory();
        SmartHomeFactory prem = new PremiumFactory();
        return "ECO: " + eco.createLight().specs() + ", " + eco.createThermostat().specs()
                + " | PREMIUM: " + prem.createLight().specs() + ", " + prem.createThermostat().specs();
    }
}
