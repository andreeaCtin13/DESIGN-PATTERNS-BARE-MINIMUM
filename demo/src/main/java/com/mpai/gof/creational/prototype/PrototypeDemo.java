package com.mpai.gof.creational.prototype;

public class PrototypeDemo {
    public static String run() {
        DeviceConfig original = new DeviceConfig("thermo1");
        original.put("minTemp", "18");
        original.put("maxTemp", "23");

        DeviceConfig clone = original.copy();
        clone.put("maxTemp", "24"); // schimbarea NU afectează originalul

        return "original=" + original.describe() + " | clone=" + clone.describe();
    }
}
