package com.lagou.lesson01javese.model04.task03thread;

public class Thread02My {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        mt1.run();

        System.out.println(mt1.getId() + "      " + mt1.getName());

        mt1.setName("jkdfks");
        System.out.println(mt1.getName());
//        mt1.start();

        Thread t2 = Thread.currentThread();
        System.out.println(t2.getId() + "     " + t2.getName());

        for (int i=0; i<20;i++){
            System.out.println("数值是--------main----" + i);
        }
    }
}
