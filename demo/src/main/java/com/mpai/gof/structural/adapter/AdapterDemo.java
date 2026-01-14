package com.mpai.gof.structural.adapter;

public class AdapterDemo {
    public static String run() {
        JsonLogger a1 = new ObjectLoggerAdapter(new LegacyLogger());
        JsonLogger a2 = new ClassLoggerAdapter();
        return a1.logJson("{\"a\":1}") + " | " + a2.logJson("{\"b\":2}");
    }
}
