package com.mpai.gof.creational.singleton;

public class SingletonDemo {
    public static String run() {
        return ClassicSingleton.getInstance().ping();
    }
}
