package com.lagou.lesson01javese.model04.work.work05;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ReaderThread extends Thread {
    private Socket s;

    public ReaderThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run(){
        System.out.println("开启读线程");
        Message m = null;

        while (true){

            ObjectInputStream ois = null;
            try {
                ois = new ObjectInputStream(s.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                m = (Message)ois.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println(m);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
