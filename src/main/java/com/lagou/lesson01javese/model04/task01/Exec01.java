package com.lagou.lesson01javese.model04.task01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exec01 {
    public static void main(String[] args) throws FileNotFoundException {
//        Thread.sleep(1000);        //编译时异常，Error
//        System.out.println( 5/0);     //运行是异常：exection

        FileInputStream file = new FileInputStream("/Users/wushengyu/Desktop/bigdt/readme.md");
        file = null;
        try {
            file.close();
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("jkfdsaj");
        }
        System.out.println("kjdfkajdfk");

    }
}
