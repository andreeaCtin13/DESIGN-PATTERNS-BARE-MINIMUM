package com.mpai.gof.structural.facade;

public class FacadeDemo {
    public static String run() {
        return new SmartHomeFacade().startMovieNight();
    }
}
