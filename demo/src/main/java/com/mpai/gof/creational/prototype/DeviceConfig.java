package com.mpai.gof.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class DeviceConfig implements Prototype<DeviceConfig> {
    private String deviceId;
    private Map<String, String> settings = new HashMap<>();

    public DeviceConfig(String deviceId) {
        this.deviceId = deviceId;
    }

    public void put(String k, String v) { settings.put(k, v); }

    /** Copy "deep-ish": map nou ca să nu împărțim același obiect mutabil. */
    @Override
    public DeviceConfig copy() {
        DeviceConfig c = new DeviceConfig(this.deviceId + "_copy");
        c.settings = new HashMap<>(this.settings);
        return c;
    }

    public String describe() { return deviceId + " " + settings; }
}
