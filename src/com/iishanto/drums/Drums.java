package com.iishanto.drums;

import com.iishanto.Settings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Drums {
    Map <String,Boolean> activeKeys=new HashMap<>();
    Map <String,ImageIcon> saved=new HashMap<>();
    private final int windowHeight;
    private final int windowWidth;
    private JFrame jFrame;
    private JLabel bg;

    public Drums(){
        windowWidth= (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/1.0);
        windowHeight= (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/1.0);
        init();
    }

    void updateBgInThread(String image){
        new Thread(new Runnable() {
            @Override
            public void run() {
                updateBg(image);
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                updateBg("sprite_1");
            }
        }).start();
    }

    private void init(){
        jFrame=new JFrame("A Java Musical: Drummer");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.requestFocusInWindow();
        bg=new JLabel();
        jFrame.setContentPane(bg);

        System.out.println(jFrame.isFocusable());
        jFrame.setResizable(false);
        updateBg("sprite_1");
        jFrame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                String key=""+e.getKeyChar();
                key=key.toUpperCase();
                activeKeys.put(key,true);
                switch (key) {
                    case "M":
                        updateBg("sprite_7");
                        break;
                    case "X":
                        updateBg("sprite_5");
                        break;
                    case "C":
                        updateBg("sprite_4");
                        break;
                    case "B":
                        updateBg("sprite_3");
                        break;
                    case " ":
                        updateBg("sprite_2");
                        break;
                    case "N":
                        updateBg("sprite_6");
                        break;
                    case "Z":
                        updateBg("sprite_8");
                        break;
                }

                for(Map.Entry<String,Boolean> keyPair:activeKeys.entrySet()){
                    if(keyPair.getValue()) {
                        Settings.getInstance().getSignal().write("drums",keyPair.getKey());
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                String key=""+e.getKeyChar();
                key=key.toUpperCase();
                activeKeys.put(key,false);
                boolean flag=false;
                for(Map.Entry<String,Boolean> kePair:activeKeys.entrySet()){
                    if(kePair.getValue()) {
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    updateBg("sprite_1");
                }
            }
        });

        jFrame.setSize(windowWidth,windowHeight);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    private void updateBg(String name){
        if(saved.get(name)==null) {
            ImageIcon bg = new ImageIcon(this.getClass().getResource("/drum/" + name + ".png"));
            Image img = bg.getImage().getScaledInstance(windowWidth, windowHeight, Image.SCALE_DEFAULT);
            saved.put(name, new ImageIcon(img));
        }
        bg.setIcon(saved.get(name));
        jFrame.validate();
        jFrame.repaint();
    }

    public void playRandom(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Robot robot=new Robot();
                    Map<Integer,String> mp=new HashMap<>();
                    mp.put(0,"Z");
                    mp.put(1,"X");
                    mp.put(2,"C");
                    mp.put(3," ");
                    mp.put(4,"B");
                    mp.put(5,"M");
                    mp.put(6,"N");

                    for(int i=1;;i++){

                        int selected= (int) ((Math.random()*1000)%7);
                        char ch=mp.get(selected).charAt(0);
                        if(jFrame.isFocused()) {
                            robot.keyPress(ch);
                            TimeUnit.MILLISECONDS.sleep(200);
                        }
                        robot.keyRelease(ch);
                        TimeUnit.MILLISECONDS.sleep(10);

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}