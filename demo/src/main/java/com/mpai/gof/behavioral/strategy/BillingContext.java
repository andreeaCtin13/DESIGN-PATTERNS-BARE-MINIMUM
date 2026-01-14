package com.mpai.gof.behavioral.strategy;

public class BillingContext {
    private PricingStrategy strategy;
    public BillingContext(PricingStrategy s){ this.strategy = s; }
    public void setStrategy(PricingStrategy s){ this.strategy = s; }
    public double bill(double kwh){ return strategy.price(kwh); }
}
