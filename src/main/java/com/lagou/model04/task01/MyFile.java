package com.lagou.model04.task01;

import java.io.File;
import java.io.IOException;

public class MyFile {
    public static void main(String[] args) {
        File f = new File("/Users/wushengyu/Desktop/bigdt/readme.md");
        System.out.println(f.lastModified());

        File f1 = new File("/Users/wushengyu/Desktop/bigdt/src/main/java/com/lagou/model04/task01/file/abc1.txt");
        if (f1.exists()){
            System.out.println(f1.getName());
            System.out.println(f1.length());
        } else {
            try {
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
