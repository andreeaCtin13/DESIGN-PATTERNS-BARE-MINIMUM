package com.mpai.gof.creational.factorymethod;

public class FactoryMethodDemo {
    public static String run() {
        DeviceCreator c1 = new LightBulbCreator();
        DeviceCreator c2 = new ThermostatCreator();
        return c1.startDevice() + " | " + c2.startDevice();
    }
}
