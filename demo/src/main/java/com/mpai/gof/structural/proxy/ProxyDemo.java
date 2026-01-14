package com.mpai.gof.structural.proxy;

public class ProxyDemo {
    public static String run() {
        CameraFeed feed = new CameraFeedProxy();
        return feed.frame() + " | " + feed.frame(); // a doua oară vine din cache
    }
}
