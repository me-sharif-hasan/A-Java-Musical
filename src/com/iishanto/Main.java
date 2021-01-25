package com.iishanto;

import com.iishanto.drums.Drums;
import com.iishanto.instrument.DrumSet;

import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException, UnsupportedAudioFileException {
        DrumSet drumSet=new DrumSet();
        new Drums(drumSet).playRandom();

    }
}
