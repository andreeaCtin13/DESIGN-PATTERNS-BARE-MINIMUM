package com.mpai.gof.behavioral.iterator;

import java.util.List;

public class IteratorDemo {
    public static String run() {
        DeviceCollection c = new DeviceCollection(List.of("TV","Lamp","Thermostat"));
        var it = c.iterator();
        StringBuilder sb = new StringBuilder();
        while(it.hasNext()) sb.append(it.next()).append(",");
        return sb.toString();
    }
}
