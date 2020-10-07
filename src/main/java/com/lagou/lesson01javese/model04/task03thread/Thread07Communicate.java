package com.lagou.lesson01javese.model04.task03thread;

import java.util.concurrent.locks.ReentrantLock;

public class Thread07Communicate implements Runnable{
    private Integer cnt = 1;
    private ReentrantLock lock = new ReentrantLock();  // 准备了一把锁


    @Override
    public void run() {
        while(true){

            synchronized (this) {
                notify();

                Thread t = Thread.currentThread();
                System.out.println(t.getId() + "  " + t.getName() + "cnt:" + cnt);
                cnt ++;
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        Thread07Communicate ta = new Thread07Communicate();
        new Thread(ta).start();
        new Thread(ta).start();



    }
}


