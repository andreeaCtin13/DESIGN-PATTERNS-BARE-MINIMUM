package com.mpai.gof.behavioral.strategy;

public class StrategyDemo {
    public static String run() {
        BillingContext ctx = new BillingContext(new FlatRateStrategy());
        double a = ctx.bill(10);
        ctx.setStrategy(new NightDiscountStrategy());
        double b = ctx.bill(10);
        return "flat=" + a + ", night=" + b;
    }
}
