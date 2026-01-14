package com.mpai.gof.creational.singleton;

/**
 * Singleton clasic (fără Spring), thread-safe, lazy, simplu.
 * (Dacă profesorul cere GoF "pur", asta e exemplul).
 */
public class ClassicSingleton {
    private ClassicSingleton() {}
    private static class Holder { private static final ClassicSingleton INSTANCE = new ClassicSingleton(); }
    public static ClassicSingleton getInstance() { return Holder.INSTANCE; }
    public String ping() { return "singleton-ok"; }
}
