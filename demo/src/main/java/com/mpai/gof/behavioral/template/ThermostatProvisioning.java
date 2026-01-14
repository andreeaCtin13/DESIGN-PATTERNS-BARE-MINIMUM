package com.mpai.gof.behavioral.template;

public class ThermostatProvisioning extends DeviceProvisioningTemplate {
    protected String allocate(){ return "allocate-thermostat"; }
    protected String configure(){ return "configure-thermostat"; }
}
