package com.iishanto.Backend;

import com.iishanto.Settings;
import com.iishanto.player.SignalProcessor;
import com.iishanto.signal.Signal;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    int port;
    SignalProcessor signalProcessor;
    public Server(){
        port= Settings.getInstance().getPort();
        signalProcessor=new SignalProcessor();
    }
    boolean stop=false;
    public void run(){
        try {
            ServerSocket serverSocket=new ServerSocket(port);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        if(stop) break;
                        Socket socket= null;
                        try {
                            socket = serverSocket.accept();
                            Socket finalSocket = socket;
                            new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    Scanner scanner= null;
                                    try {
                                        scanner = new Scanner(finalSocket.getInputStream());
                                        while (scanner.hasNextLine()){
                                            String line=scanner.nextLine();
                                            signalProcessor.playSignal(line);
                                        }
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }).start();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void stop(){
        stop=true;
    }
}
