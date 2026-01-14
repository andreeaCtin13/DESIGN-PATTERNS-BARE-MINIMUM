package com.mpai.gof.structural.proxy;

/**
 * Proxy: creează RealCameraFeed doar la nevoie (lazy),
 * și poate adăuga și cache / security / rate limiting.
 */
public class CameraFeedProxy implements CameraFeed {
    private RealCameraFeed real;
    private String lastFrame;

    @Override
    public String frame() {
        if (real == null) real = new RealCameraFeed(); // lazy init
        if (lastFrame == null) lastFrame = real.frame(); // cache simplu
        return "PROXY>> " + lastFrame;
    }
}
