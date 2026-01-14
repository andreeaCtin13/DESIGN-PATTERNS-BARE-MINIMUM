package com.mpai.gof.creational.singleton;

import org.springframework.stereotype.Service;

/**
 * În Spring, un @Service este singleton by default în container.
 * Asta e forma recomandată în aplicații Spring.
 */
@Service
public class AppConfigService {
    public String configVersion() { return "v1"; }
}
