package com.lagou.model04.task03thread;

public class Thread03Myrunable {
    public static void main(String[] args) {
//        MyRunable myrun = new MyRunable();
//        myrun.run();
//        myrun.start();
        Thread t = new Thread(new MyRunable());
//        t.start();
        t.run();

        for (int i=0; i<20;i++){
            System.out.println("数值是--------main----" + i);
        }
    }
}

