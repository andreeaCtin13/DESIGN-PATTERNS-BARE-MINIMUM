package com.mpai.gof.structural.adapter;

/**
 * Class Adapter: extinde adaptee și implementează target.
 * Limitare: Java are o singură moștenire -> folosești doar dacă e ok să extinzi clasa.
 */
public class ClassLoggerAdapter extends LegacyLogger implements JsonLogger {
    @Override
    public String logJson(String json) {
        return write("json=" + json);
    }
}
