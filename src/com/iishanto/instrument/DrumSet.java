package com.iishanto.instrument;

import com.iishanto.player.MusicPlayer;
import com.iishanto.signal.Signal;

import javax.sound.sampled.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DrumSet {
    Map<String,String> mp=new HashMap<>();
    public DrumSet(){
        mp.put("M","crash_cymbal");
        mp.put("X","tom_high");
        mp.put("C","tom_medium");
        mp.put("B","snare_drum");
        mp.put(" ","tom_floor");
        mp.put("N","cymbal_hi_hats");
        mp.put("Z","cymbal_ride");
    }
    public void hit(String s){
        s=s.toUpperCase();
        try {
            String tune=mp.get(s);
            if(tune==null) return;
            play(tune);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
    }
    public void play(String tone) throws IOException, UnsupportedAudioFileException {
        String path="/drum/"+tone+".wav";
        AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(this.getClass().getResourceAsStream(path));
        MusicPlayer player=new MusicPlayer();
        new Thread(() -> player.play(audioInputStream)).start();
    }
}
