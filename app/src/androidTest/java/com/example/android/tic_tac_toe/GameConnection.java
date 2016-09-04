package com.example.android.tic_tac_toe;

import java.net.InetAddress;
import java.net.ServerSocket;

/**
 * Created by Gowtham on 31/08/16.
 */
public class GameConnection {

    public Server mServer;
    public Client mClient;

    public ServerSocket mSocket;
    public int mPort = -1;


    public class Server{

        mSocket = new ServerSocket(0);
        setLocalPort(mSocket.getLocalPort());


    }

    public class Client {


    }


    public int getLocalPort(){
        return mPort;
    }
    public void setLocalPort(int port) {
        mPort = port;
    }

    public void connectToServer(InetAddress address, int port) {
        mClient = new Client(address, port);
    }


}

