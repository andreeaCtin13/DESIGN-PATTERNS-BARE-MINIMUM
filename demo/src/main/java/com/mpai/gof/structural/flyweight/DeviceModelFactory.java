package com.mpai.gof.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * FlyweightFactory: păstrează cache de modele.
 * Dacă cerem de 1000 ori același model, întoarce aceeași instanță.
 */
public class DeviceModelFactory {
    private final Map<String, DeviceModel> cache = new HashMap<>();

    public DeviceModel get(String modelName) {
        return cache.computeIfAbsent(modelName, m -> new DeviceModel(m, "icon:" + m));
    }

    public int cacheSize(){ return cache.size(); }
}
