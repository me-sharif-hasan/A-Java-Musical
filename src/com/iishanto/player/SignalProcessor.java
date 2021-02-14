package com.iishanto.player;

import com.iishanto.instrument.DrumSet;
import com.iishanto.instrument.PianoCore;

public class SignalProcessor {
    DrumSet drumSet;
    PianoCore pianoCore;
    public SignalProcessor(){
        drumSet=new DrumSet();
        pianoCore=new PianoCore();
    }
    public void playSignal(String notes){
        String []lines=notes.split(":");
        switch (lines[0]){
            case "drums":
                drumSet.hit(lines[1]);
                break;
            case "piano":
                System.out.println(lines[1]);
                pianoCore.push(lines[1]);
                break;
        }
    }
}
