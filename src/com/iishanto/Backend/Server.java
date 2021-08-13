package com.iishanto.Backend;

import com.iishanto.Settings;
import com.iishanto.player.SignalProcessor;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    int port;
    SignalProcessor signalProcessor;
    ServerSocket serverSocket;
    public Server(){
        port= Settings.getInstance().getPort();
        try {
            serverSocket=new ServerSocket(port);
            signalProcessor=new SignalProcessor();
            Settings.getInstance().setLog("Server started at port "+port+"<br>IP: "+ InetAddress.getLocalHost().getHostAddress());
            Settings.getInstance().setServerState(true);
        } catch (IOException e) {
            Settings.getInstance().setLog(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
    boolean stop=false;
    public void run(){
        try {
            new Thread(() -> {
                while (!stop && !serverSocket.isClosed()) {
                    Socket socket;
                    try {
                        socket = serverSocket.accept();
                        Socket finalSocket = socket;
                        new Thread(() -> {
                            Scanner scanner;
                            try {
                                scanner = new Scanner(finalSocket.getInputStream());
                                while (scanner.hasNextLine()&&!serverSocket.isClosed()) {
                                    String line = scanner.nextLine();
                                    signalProcessor.playSignal(line);
                                }
                                scanner.close();
                                socket.close();

                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }).start();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                Settings.getInstance().setServerState(false);
            }).start();
        } catch (Exception e) {
            Settings.getInstance().setLog(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
    public void stop(){
        stop=true;
        if(serverSocket==null) {
            System.out.println("Server socket is null");
            return;
        }
        try {
            serverSocket.close();
            Settings.getInstance().setServerState(false);
            Settings.getInstance().setLog("Server closed");
            stop=false;
        } catch (IOException e) {
            Settings.getInstance().setLog(e.getLocalizedMessage());
            stop=true;
        }
    }
}
