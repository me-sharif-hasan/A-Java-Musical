package com.iishanto;

import com.iishanto.Backend.FrontEndServer;
import com.iishanto.Backend.Server;
import com.iishanto.Guitar.GuitarUI;
import com.iishanto.Vocal.Vocal;
import com.iishanto.drums.Drums;
import com.iishanto.piano.PianoJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Select your instrument!");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);
        setBounds(0,0,500, (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight());

        JButton guitar=new JButton();
        guitar.setText("Guitar");
        setCords(guitar,50,10,400,70);
        guitar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GuitarUI().showGuitar();
                setVisible(false);
            }
        });
        add(guitar);

        JButton drums=new JButton();
        drums.setText("Drums");
        setCords(drums,50,70+50,400,70);
        drums.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Drums();
                setVisible(false);
            }
        });
        add(drums);

        JButton piano=new JButton();
        piano.setText("Piano");
        setCords(piano,50,70+30+50+70,400,70);
        piano.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PianoJFrame().showPiano();
                setVisible(false);
            }
        });
        add(piano);

        JButton music=new JButton();
        music.setText("Music selector");
        setCords(music,50,70+30+50+70+50+70,400,70);
        music.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Vocal("Sing as you wish - A java musical").showVocal();
                setVisible(false);
            }
        });
        add(music);

        setVisible(true);
    }
    void setCords(JButton jb,int x,int y,int w,int h){
        jb.setBounds(x,y,w,h);
    }

}
