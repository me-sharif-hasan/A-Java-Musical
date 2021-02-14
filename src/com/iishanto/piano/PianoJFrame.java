package com.iishanto.piano;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.iishanto.Settings;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
import sun.audio.AudioData;
import sun.audio.AudioDataStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;


 */
public class PianoJFrame extends javax.swing.JFrame {

    //AudioPlayer MGP = AudioPlayer.player;
    //AudioStream BGM;
    //AudioData MD;
    //AudioDataStream loop = null;

    public PianoJFrame() {
        initComponents();
        setSize(700,380);
    }
    public void showPiano(){
        setBackground(SystemColor.lightGray);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        CHButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jchkMusic = new javax.swing.JRadioButton();
        DHButton = new javax.swing.JButton();
        DButton = new javax.swing.JButton();
        E = new javax.swing.JButton();
        FHButton = new javax.swing.JButton();
        FButton = new javax.swing.JButton();
        GHBotton = new javax.swing.JButton();
        GButton = new javax.swing.JButton();
        BbButton = new javax.swing.JButton();
        AButton = new javax.swing.JButton();
        BButton = new javax.swing.JButton();
        HHButton = new javax.swing.JButton();
        C1Button = new javax.swing.JButton();
        IHButton = new javax.swing.JButton();
        D1Button = new javax.swing.JButton();
        E1Button = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        CButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(Color.ORANGE);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 8));
        jPanel1.setLayout(null);

        CHButton.setBackground(new java.awt.Color(0, 0, 0));
        CHButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CHButton.setForeground(new java.awt.Color(255, 255, 255));
        CHButton.setText("C#"); // NOI18N
        CHButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        CHButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //CHButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CHButton);
        CHButton.setBounds(50, 80, 60, 110);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("virtual Piano");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 10, 140, 30);

        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setText("Music Notes");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(100, 40, 110, 23);

        buttonGroup1.add(jchkMusic);
        jchkMusic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jchkMusic.setText("Virtual Steel Drum");
        jPanel1.add(jchkMusic);
        jchkMusic.setBounds(450, 40, 150, 25);

        DButton.setRolloverEnabled(false);
        DHButton.setRolloverEnabled(false);
        FHButton.setRolloverEnabled(false);
        FButton.setRolloverEnabled(false);
        GButton.setRolloverEnabled(false);
        GHBotton.setRolloverEnabled(false);
        BbButton.setRolloverEnabled(false);
        BButton.setRolloverEnabled(false);
        HHButton.setRolloverEnabled(false);
        C1Button.setRolloverEnabled(false);
        IHButton.setRolloverEnabled(false);
        D1Button.setRolloverEnabled(false);
        E1Button.setRolloverEnabled(false);
        AButton.setRolloverEnabled(false);
        DButton.setRolloverEnabled(false);
        E.setRolloverEnabled(false);
        CButton.setRolloverEnabled(false);



        DHButton.setBackground(java.awt.Color.black);
        DHButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DHButton.setForeground(new java.awt.Color(255, 255, 255));
        DHButton.setText("D#");
        DHButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        DHButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings.getInstance().getSignal().write("piano","D_s");
            }
        });
        jPanel1.add(DHButton);
        DHButton.setBounds(108, 80, 60, 110);

        DButton.setBackground(new java.awt.Color(255, 255, 255));
        DButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DButton.setText("D");
        DButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        DButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings.getInstance().getSignal().write("piano","D");
            }
        });
        jPanel1.add(DButton);
        DButton.setBounds(92, 190, 50, 120);

        E.setText("E");
        E.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings.getInstance().getSignal().write("piano","E");
            }
        });
        jPanel1.add(E);
        E.setBounds(144, 190, 50, 120);

        FHButton.setBackground(new java.awt.Color(0, 0, 0));
        FHButton.setForeground(new java.awt.Color(255, 255, 255));
        FHButton.setText("F#");
        FHButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        FHButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings.getInstance().getSignal().write("piano","F_s1");
            }
        });
        jPanel1.add(FHButton);
        FHButton.setBounds(212, 80, 60, 110);

        FButton.setText("F");
        FButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        FButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings.getInstance().getSignal().write("piano","F");
            }
        });
        jPanel1.add(FButton);
        FButton.setBounds(196, 190, 50, 120);

        GHBotton.setBackground(new java.awt.Color(0, 0, 0));
        GHBotton.setForeground(new java.awt.Color(255, 255, 255));
        GHBotton.setText("G#");
        GHBotton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        GHBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings.getInstance().getSignal().write("piano","G_s1");
            }
        });
        jPanel1.add(GHBotton);
        GHBotton.setBounds(270, 80, 60, 110);

        GButton.setText("G");
        GButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        GButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings.getInstance().getSignal().write("piano","G");
            }
        });
        jPanel1.add(GButton);
        GButton.setBounds(248, 190, 50, 120);

        BbButton.setBackground(new java.awt.Color(0, 0, 0));
        BbButton.setForeground(new java.awt.Color(255, 255, 255));
        BbButton.setText("Bb");
        BbButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings.getInstance().getSignal().write("piano","Bb");
            }
        });
        jPanel1.add(BbButton);
        BbButton.setBounds(328, 80, 60, 110);

        AButton.setText("A");
        AButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        AButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings.getInstance().getSignal().write("piano","A");
            }
        });
        jPanel1.add(AButton);
        AButton.setBounds(300, 190, 50, 120);

        BButton.setText("B");
        BButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings.getInstance().getSignal().write("piano","B");
            }
        });
        jPanel1.add(BButton);
        BButton.setBounds(352, 190, 50, 120);

        HHButton.setBackground(new java.awt.Color(0, 0, 0));
        HHButton.setForeground(new java.awt.Color(255, 255, 255));
        HHButton.setText("C#1");
        HHButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        HHButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings.getInstance().getSignal().write("piano","C_s1");
            }
        });
        jPanel1.add(HHButton);
        HHButton.setBounds(418, 80, 60, 110);

        C1Button.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        C1Button.setText("C1");
        C1Button.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //C1ButtonActionPerformed(evt);
                Settings.getInstance().getSignal().write("piano","C1");
            }
        });
        jPanel1.add(C1Button);
        C1Button.setBounds(404, 190, 50, 120);

        IHButton.setBackground(new java.awt.Color(0, 0, 0));
        IHButton.setForeground(new java.awt.Color(255, 255, 255));
        IHButton.setText("D#1");
        IHButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        IHButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings.getInstance().getSignal().write("piano","D_s1");
            }
        });
        jPanel1.add(IHButton);
        IHButton.setBounds(476, 80, 60, 110);

        D1Button.setText("D1");
        D1Button.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        D1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings.getInstance().getSignal().write("piano","D1");
            }
        });
        jPanel1.add(D1Button);
        D1Button.setBounds(456, 190, 50, 120);

        E1Button.setText("E1");
        E1Button.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        E1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings.getInstance().getSignal().write("piano","E1");
            }
        });
        jPanel1.add(E1Button);
        E1Button.setBounds(508, 190, 50, 120);

        F1.setText("F1");
        F1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings.getInstance().getSignal().write("piano","F1");
            }
        });
        jPanel1.add(F1);
        F1.setBounds(560, 190, 50, 120);

        CButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CButton.setText("C");
        CButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        CButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings.getInstance().getSignal().write("piano","C");
            }
        });
        jPanel1.add(CButton);
        CButton.setBounds(40, 190, 50, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 680, 330);

        pack();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AButton;
    private javax.swing.JButton BButton;
    private javax.swing.JButton BbButton;
    private javax.swing.JButton C1Button;
    private javax.swing.JButton CButton;
    private javax.swing.JButton CHButton;
    private javax.swing.JButton D1Button;
    private javax.swing.JButton DButton;
    private javax.swing.JButton DHButton;
    private javax.swing.JButton E;
    private javax.swing.JButton E1Button;
    private javax.swing.JButton F1;
    private javax.swing.JButton FButton;
    private javax.swing.JButton FHButton;
    private javax.swing.JButton GButton;
    private javax.swing.JButton GHBotton;
    private javax.swing.JButton HHButton;
    private javax.swing.JButton IHButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jchkMusic;
    // End of variables declaration//GEN-END:variables
}