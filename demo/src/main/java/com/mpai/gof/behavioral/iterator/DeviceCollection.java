package com.mpai.gof.behavioral.iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class DeviceCollection {
    private final List<String> devices;
    public DeviceCollection(List<String> devices){ this.devices = devices; }

    public Iterator iterator(){ return new Iterator(); }

    /** Iterator intern */
    public class Iterator {
        private int idx = 0;

        public boolean hasNext(){ return idx < devices.size(); }

        public String next(){
            if(!hasNext()) throw new NoSuchElementException();
            return devices.get(idx++);
        }
    }
}
