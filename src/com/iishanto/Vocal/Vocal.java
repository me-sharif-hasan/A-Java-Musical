package com.iishanto.Vocal;

import com.iishanto.Backend.Server;
import com.iishanto.Settings;
import com.iishanto.player.MusicPlayer;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.AdvancedPlayer;

import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Vocal extends JFrame {
    JLabel jLabel;
    String title;
    SourceDataLine speaker;
    AdvancedPlayer advancedPlayer=null;
    InputStream inputStream;
    boolean state=true;
    JButton port_btn=null;
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
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        int windowWidth= (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/1.0);
        int windowHeight= (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/1.0);

        setBounds(0,0,windowWidth,windowHeight);
        setBackground();

        JFileChooser jfc=new JFileChooser();
        jfc.setFileFilter(new FileNameExtensionFilter("mp3 file","mp3"));
        jfc.setBounds(0,0,windowWidth/2,windowHeight-100);
        jfc.setApproveButtonText("Select");

        add(jfc);

        jfc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
                if(e.getActionCommand().equals("ApproveSelection")){
                    File file=jfc.getSelectedFile();
                    try {
                        inputStream=new FileInputStream(file.getAbsolutePath());
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        JTextField port_field=new JTextField();
        port_field.setText("8080");
        port_field.setBounds(jfc.getWidth()+150,400,100,50);
        add(port_field);
        port_btn=new JButton();
        port_btn.setText("Run server");
        port_btn.setBounds(jfc.getWidth()+310,400,200,50);
        add(port_btn);

        port_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Settings.getInstance().setServerPort(Integer.parseInt(port_field.getText()));
                runServer();
            }
        });
        JButton play=new JButton();
        play.setText("Play");
        play.setBounds(jfc.getWidth()+200,200,100,50);
        add(play);

        jLabel=new JLabel("<html><font color='white' style='font-size:15px;'>Run the server on a free port</font></html>");
        jLabel.setBounds(jfc.getWidth()+150,500,400,50);
        add(jLabel);

        play.addActionListener(new ActionListener() {
            Thread trd=null;
            @Override
            public void actionPerformed(ActionEvent e) {
                if(state){
                    play.setText("Stop");
                    state=false;
                        trd=new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    advancedPlayer=new AdvancedPlayer(inputStream);
                                    advancedPlayer.play();
                                } catch (JavaLayerException ex) {
                                    ex.printStackTrace();
                                    state=false;
                                    play.setText("Play");
                                }
                            }
                        });
                        trd.start();

                }else{
                    try {
                        play.setText("Play");
                        state=true;
                        trd.stop();
                    }catch (Exception ee){
                        ee.printStackTrace();
                        state=false;
                        play.setText("Stop");
                      }
                }
            }
        });
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
    Server server;
    private void runServer() {

        System.out.println(Settings.getInstance().isServerState());
        if (!Settings.getInstance().isServerState()) {
            server = new Server();
            server.run();
            port_btn.setText("Stop server");
            System.out.println("Server started");
        } else {
            if(server!=null) {
                server.stop();
                port_btn.setText("Run server");
                System.out.println("server closed");
            }
        }
        System.out.println(Settings.getInstance().isServerState());
        jLabel.setText("<html><font color='white' style='font-size:15px;'>"+Settings.getInstance().getLog()+"</font></html>");
    }

}
