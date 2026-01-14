package com.mpai.gof.structural.bridge;

public class SpeakerApi implements DeviceApi {
    public String powerOn(){ return "Speaker ON"; }
    public String powerOff(){ return "Speaker OFF"; }
}
