package com.iishanto.signal;

import com.iishanto.Settings;
import com.iishanto.instrument.DrumSet;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Signal {
    DrumSet drumSet;
    Socket socket=null;
    public boolean isConnected=false;
    public Signal(){
        drumSet=new DrumSet();
        try {
            socket=new Socket("localhost", Settings.getInstance().getPort());
            isConnected=true;
        } catch (IOException e) {
            System.out.println("Error: "+e.getLocalizedMessage());
            isConnected=false;
        }
    }
    public void write(String instrument,String signal){
        try {
            socket.getOutputStream().write((instrument+":"+signal+"\n").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
