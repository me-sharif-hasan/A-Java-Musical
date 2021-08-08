package com.iishanto.Backend;

import com.iishanto.Settings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrontEndServer {
    private final int windowWidth,windowHeight;

    public FrontEndServer(){
        windowWidth= (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/1.0);
        windowHeight= (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/1.0);
        init();
    }
    void init(){
        JFrame jFrame=new JFrame("A Java Musical");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(windowWidth,windowHeight);
        jFrame.setResizable(false);

        JPanel jPanel1=new JPanel(null);

        jPanel1.setBounds(0,0,jFrame.getWidth(),jFrame.getHeight());
        
        JLabel heading=new JLabel();
        int y=(int)Settings.getInstance().percent(35,jPanel1.getHeight());
        int x=(int)Settings.getInstance().percent(31,jPanel1.getWidth());
        System.out.println(x+" "+y);
        heading.setBounds(x,y,600,70);
        heading.setText("A Java Musical: Server");
        heading.setFont(heading.getFont().deriveFont(47.0f));

        int x1=(int)Settings.getInstance().percent(57,jPanel1.getWidth());

        JLabel portLabel=new JLabel();
        portLabel.setText("Select port to open, default 8080");
        portLabel.setBounds(x1-250,y+90,350,30);
        jPanel1.add(portLabel);
        JTextField port=new JTextField();
        port.setBounds(x1,y+90,100,30);
        jPanel1.add(port);

        jPanel1.add(heading);


        JButton createButton=new JButton();
        createButton.setText("Login as a vocal");
        createButton.setBounds(x1-225,y+180,300,50);

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runServer();
                jFrame.setVisible(false);
            }
        });







        jPanel1.add(createButton);

        jFrame.add(jPanel1);

        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    boolean state=false;
    private void runServer() {
        Server server = new Server();
        if (!state) {
            server.run();
            state = true;
        } else {
            state = false;
            server.stop();
        }
    }
}
