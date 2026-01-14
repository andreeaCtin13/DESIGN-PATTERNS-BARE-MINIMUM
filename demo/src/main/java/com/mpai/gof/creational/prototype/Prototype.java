package com.mpai.gof.creational.prototype;

/**
 * Prototype: definește un contract de clonare.
 * În Java, poți folosi Cloneable, dar de multe ori e mai clar un "copy constructor" / method.
 */
public interface Prototype<T> {
    T copy();
}
