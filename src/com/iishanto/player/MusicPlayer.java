package com.iishanto.player;

import javax.sound.sampled.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MusicPlayer {
    AudioFormat format;
    TargetDataLine mic;
    SourceDataLine speaker;

    Map<String,AudioInputStream> notes=new HashMap<>();
    public MusicPlayer(){
        format = null;
        DataLine.Info micInfo = new DataLine.Info(TargetDataLine.class, format);
        DataLine.Info speakerInfo= new DataLine.Info(SourceDataLine.class, format);
        try {
            mic=(TargetDataLine) AudioSystem.getLine(micInfo);
            speaker=(SourceDataLine) AudioSystem.getLine(speakerInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void play(AudioInputStream audioInputStream){
        try {
            format=audioInputStream.getFormat();
            speaker.open(format);
            speaker.start();
            byte []data = new byte[1024000];
            try {
                int len=audioInputStream.read(data);
                if(len==-1) return;
                speaker.write(data,0,len);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        speaker.drain();
        speaker.close();
    }
}
