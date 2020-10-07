package com.lagou.lesson01javese.model04.task03thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Thread05Sleep extends Thread {
    @Override
    public void run() {
        while (true){
            Date dt = new Date();
            SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
            System.out.println(dtf.format(dt));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        Thread05Sleep t = new Thread05Sleep();
        t.start();

        Thread tm = Thread.currentThread();
        tm.stop();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.stop();

    }
}
