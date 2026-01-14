package com.mpai.gof.structural.proxy;

/** Obiect "real" (costisitor) */
public class RealCameraFeed implements CameraFeed {
    public RealCameraFeed() {
        // simulăm inițializare scumpă
    }
    public String frame(){ return "📷 FRAME(" + System.nanoTime() + ")"; }
}
