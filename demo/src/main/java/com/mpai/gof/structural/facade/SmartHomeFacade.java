package com.mpai.gof.structural.facade;

/**
 * Facade ascunde complexitatea: clientul cheamă un singur method.
 */
public class SmartHomeFacade {
    private final Lights lights = new Lights();
    private final Tv tv = new Tv();
    private final Speakers speakers = new Speakers();

    public String startMovieNight() {
        return String.join(" | ", lights.dim(), tv.on(), speakers.on());
    }
}
