package com.iishanto;

import com.iishanto.signal.Signal;

import java.awt.*;
import java.io.IOException;
import java.net.Socket;

public class Settings {
    private static Settings settings=null;
    private Signal signal=null;
    private int serverPort=8080;
    private int wWidth,wHeight;
    String log;
    boolean serverState=false;
    String ip="localhost";
    private Settings(){
        wHeight=(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/1.0);
        wWidth=(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/1.0);
        System.out.println(wHeight+" "+wWidth);
    }
    public void setIp(String i){
        ip=i;
    }
    public String getIp(){
        return ip;
    }
    public void setServerState(boolean state){
        serverState=state;
    }

    public boolean isServerState() {
        return serverState;
    }

    public void setLog(String log){
        this.log=log;
    }
    public String getLog(){return log;}
    public Signal getSignal(){
        System.out.println("Current server state: "+Settings.getInstance().isServerState());
        if(signal==null|| !signal.isConnected){
            signal=new Signal();
        }
            return signal;

    }
    public float wPercent(float x){
        return percent(x,wWidth);
    }
    public float hPercent(float h){
        return percent(h,wHeight);
    }

    public float percent(float x,float y){
        return x*y/100;
    }
    public int getPort(){
        return serverPort;
    }
    public void setServerPort(int port){
        this.serverPort=port;
    }
    public boolean demo_connect(){
        try {
            Socket socket=new Socket(ip,serverPort);
            System.out.println("Connection passed: "+socket.isConnected());
            if(socket.isConnected()) {
                socket.close();
                return true;
            }
            socket.close();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public static Settings getInstance(){
        if(settings==null) {
            settings = new Settings();
        }
        return settings;

    }
}
