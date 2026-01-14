package com.mpai.gof.structural.adapter;

/**
 * Object Adapter: conține (has-a) un LegacyLogger și îl adaptează la JsonLogger.
 * Avantaj: poți adapta și subclase, compui ușor.
 */
public class ObjectLoggerAdapter implements JsonLogger {
    private final LegacyLogger legacy;
    public ObjectLoggerAdapter(LegacyLogger legacy) { this.legacy = legacy; }

    @Override
    public String logJson(String json) {
        return legacy.write("json=" + json);
    }
}
