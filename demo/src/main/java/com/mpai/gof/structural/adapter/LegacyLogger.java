package com.mpai.gof.structural.adapter;

/** Adaptee (o librărie veche) - are altă interfață */
public class LegacyLogger {
    public String write(String text) { return "LEGACY>> " + text; }
}
