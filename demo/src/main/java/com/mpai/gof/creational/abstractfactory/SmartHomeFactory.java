package com.mpai.gof.creational.abstractfactory;

/**
 * Abstract Factory: interfață pentru crearea unei familii de produse.
 * Clientul lucrează doar cu această interfață, fără să știe clasele concrete.
 */
public interface SmartHomeFactory {
    SmartLight createLight();
    SmartThermostat createThermostat();
}
