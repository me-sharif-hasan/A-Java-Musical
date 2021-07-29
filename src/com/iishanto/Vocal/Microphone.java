package com.iishanto.Vocal;

import com.iishanto.player.MusicPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Microphone {
    AudioFormat audioFormat=new AudioFormat(44100,16,2,true,false);
    TargetDataLine targetDataLine;
    SourceDataLine sourceDataLine;
    public Microphone(){
        record();
        play();
    }
    private void record(){
        DataLine.Info info=new DataLine.Info(TargetDataLine.class,audioFormat);
        try {
            targetDataLine=(TargetDataLine) AudioSystem.getLine(info);
            targetDataLine.open();
            targetDataLine.start();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Microphone okay");
    }

    private  void play(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                DataLine.Info info=new DataLine.Info(SourceDataLine.class,audioFormat);
                try {
                    AudioInputStream audioInputStream=new AudioInputStream(targetDataLine);
                    sourceDataLine=(SourceDataLine) AudioSystem.getLine(info);
                    sourceDataLine.open(audioInputStream.getFormat());
                    sourceDataLine.start();
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            byte []b=new byte[targetDataLine.getBufferSize()];
                            while (true){
                                int sz= targetDataLine.read(b,0,b.length);
                                if(sz>-1){
                                    sourceDataLine.write(b,0,sz);
                                }
                            }
                        }
                    }).start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        System.out.println("Speaker okay");
    }
}
