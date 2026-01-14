package com.mpai.gof.behavioral.strategy;

import com.mpai.gof.behavioral.strategy.PricingStrategy;

public class NightDiscountStrategy implements PricingStrategy {
    public double price(double kwh){ return kwh * 0.7; }
}