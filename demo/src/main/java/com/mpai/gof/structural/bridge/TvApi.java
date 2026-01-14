package com.mpai.gof.structural.bridge;

public class TvApi implements DeviceApi {
    public String powerOn(){ return "TV ON"; }
    public String powerOff(){ return "TV OFF"; }
}
