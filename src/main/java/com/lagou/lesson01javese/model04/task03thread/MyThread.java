package com.lagou.lesson01javese.model04.task03thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i=0; i<20;i++){
            System.out.println("数值是" + i);
        }
    }
}
