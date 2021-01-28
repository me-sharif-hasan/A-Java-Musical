package com.iishanto.player;

import com.iishanto.instrument.DrumSet;

public class SignalProcessor {
    DrumSet drumSet;
    public SignalProcessor(){
        drumSet=new DrumSet();
    }
    public void playSignal(String notes){
        String []lines=notes.split(":");
        switch (lines[0]){
            case "drums":
                drumSet.hit(lines[1]);
                break;
        }
    }
}
