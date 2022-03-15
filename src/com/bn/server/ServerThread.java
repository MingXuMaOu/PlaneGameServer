package com.bn.server;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author liuming
 * @description
 * @date 2022/3/15
 */
public class ServerThread extends Thread{

    private boolean flag = false;
    private ServerSocket ss;

    @Override
    public void run() {
        try{
            ss = new ServerSocket(9999);
            System.out.println("Server Listenering on 9999");
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        while (flag){
            try{
                Socket sc = ss.accept();
                System.out.println(sc.getInetAddress() + " connect...");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new ServerThread().start();
    }


}
