package com.iishanto.Vocal;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URL;

public class Vocal extends JFrame {
    String title;
    class Paint extends JComponent{
        Image image;
        public Paint(Image i){
            image=i;
        }
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(image, 0, 0, this);
        }
    }
    public Vocal(String title){
        super(title);
        this.title=title;
        setFrames();
    }
    void setFrames(){
        setLayout(null);
        int windowWidth= (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/1.0);
        int windowHeight= (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/1.0);

        setBounds(0,0,windowWidth,windowHeight);
        setBackground();

        JFileChooser jfc=new JFileChooser();
        jfc.setBounds(0,0,300,300);
        //add(jfc);


        JButton turnOnMic=new JButton();
        turnOnMic.setBounds(0,0,300,300);
        turnOnMic.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Microphone();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(turnOnMic);
    }
    void setBackground(){
        URL bgImage=getClass().getResource("/vocal/vocal.jpg");
        try {
            Image bg= ImageIO.read(bgImage);
            setContentPane(new Paint(bg));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showVocal(){
        setVisible(true);
    }
}
