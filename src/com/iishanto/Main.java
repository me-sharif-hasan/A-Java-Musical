package com.iishanto;

import com.iishanto.Backend.Server;
import com.iishanto.drums.Drums;
import com.iishanto.signal.Signal;

import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException, UnsupportedAudioFileException {
        Server server=new Server();
        server.run();
        new Drums().playRandom();

    }
}
