package com.lagou.lesson01javese.model04.task03thread;

public class Thread04Niming {
    public static void main(String[] args) {
//        Thread t1 = new Thread(){
//            @Override
//            public void run() {
//                for (int i=0; i<20;i++){
//                    System.out.println("数值是--------继承----" + i);
//                }            }
//        };
//
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                for (int i=0; i<20;i++){
//                    System.out.println("数值是--------接口----" + i);
//                }            }
//        };
//
//        Thread t2 = new Thread(r1);
//
//
//        t1.start();
//        t2.start();

        new Thread(){
            @Override
            public void run() {
                for (int i=0; i<20;i++){
                    System.out.println("数值是--------继承----" + i);
                }            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<20;i++){
                    System.out.println("数值是--------接口----" + i);
                }            }
        }).start();


    }
}
