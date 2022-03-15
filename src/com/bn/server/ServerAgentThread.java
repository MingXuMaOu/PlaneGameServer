package com.bn.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 * @author liuming
 * @description
 * @date 2022/3/15
 */
public class ServerAgentThread extends Thread{
    static int count = 0;

    static int rx = 150;
    static int ry = 750;
    static int gx = 460;
    static int gy = 750;

    static Object lock = new Object();
    Socket sc;
    DataInputStream din;
    DataOutputStream dout;
    int redOrYellow;
    boolean flag = true;
    public static void broadcastState(){

    }

    public ServerAgentThread(Socket sc){
        this.sc = sc;
        try{
            din = new DataInputStream(sc.getInputStream());
            dout = new DataOutputStream(sc.getOutputStream());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
