package com.mpai.gof.behavioral.template;

/**
 * Template: definește pașii algoritmului (final) și lasă hook-uri abstracte.
 */
public abstract class DeviceProvisioningTemplate {

    public final String provision() {
        // algoritm fix (schelet)
        String a = validate();
        String b = allocate();
        String c = configure();
        return String.join(" | ", a, b, c);
    }

    protected String validate(){ return "validate-ok"; } // hook opțional
    protected abstract String allocate();
    protected abstract String configure();
}
