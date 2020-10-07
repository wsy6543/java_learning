package com.lagou.lesson01javese.model04.task02;

import java.io.*;

public class Io6Object {
    public static void main(String[] args) {
        ObjectOutputStream oi = null;
        try {
            oi = new ObjectOutputStream(new FileOutputStream("/Users/wushengyu/Desktop/bigdt/src/main/java/com/lagou/model04/task01/file/obj.txt"));
            User u = new User(12,"wsy");
            oi.writeObject(u);
            System.out.println("写入成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oi != null){
                try {
                    oi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        ObjectInputStream oint = null;
        try {
            oint = new ObjectInputStream(new FileInputStream("/Users/wushengyu/Desktop/bigdt/src/main/java/com/lagou/model04/task01/file/obj.txt"));
            User user = new User();
            Object res = oint.readObject();
            System.out.println(res);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (oint != null){
                try {
                    oint.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
