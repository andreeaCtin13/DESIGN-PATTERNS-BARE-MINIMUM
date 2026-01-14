package com.mpai.gof.behavioral.strategy;

public class FlatRateStrategy implements PricingStrategy {
    public double price(double kwh){ return kwh * 1.0; }
}

