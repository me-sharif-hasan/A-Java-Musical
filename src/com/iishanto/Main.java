package com.iishanto;

import com.iishanto.Backend.FrontEndServer;
import com.iishanto.Backend.Server;
import com.iishanto.drums.Drums;
import com.iishanto.instrument.PianoCore;
import com.iishanto.piano.PianoJFrame;
import com.iishanto.signal.Signal;

import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException, UnsupportedAudioFileException {
    new FrontEndServer();
    new Drums();
    new PianoJFrame().showPiano();
    }
}
