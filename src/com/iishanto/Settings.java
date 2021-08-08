package com.iishanto;

import com.iishanto.signal.Signal;

import java.awt.*;

public class Settings {
    private static Settings settings=null;
    private Signal signal=null;
    private int serverPort=8080;
    private int wWidth,wHeight;
    String log;
    private Settings(){
        wHeight=(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/1.0);
        wWidth=(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/1.0);
        System.out.println(wHeight+" "+wWidth);
    }
    public void setLog(String log){
        this.log=log;
    }
    public String getLog(){return log;}
    public Signal getSignal(){
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
    public static Settings getInstance(){
        if(settings==null) {
            settings = new Settings();
        }
        return settings;

    }
}
