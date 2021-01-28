package com.iishanto;

import com.iishanto.signal.Signal;

public class Settings {
    private static Settings settings=null;
    private Signal signal=null;
    private int serverPort=8080;
    private Settings(){
    }
    public Signal getSignal(){
        if(signal==null){
            signal=new Signal();
        }
            return signal;

    }
    public int getPort(){
        return serverPort;
    }
    public static Settings getInstance(){
        if(settings==null) {
            settings = new Settings();
        }
        return settings;

    }
}
