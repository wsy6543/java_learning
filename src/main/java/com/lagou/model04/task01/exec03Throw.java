package com.lagou.model04.task01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exec03Throw {
    public static void show() throws IOException {
        FileInputStream file = new FileInputStream("/Users/wushengyu/Desktop/bigdt/readm.md");
        System.out.println("jkdfsakjd");
        file.close();
    }

    public static void main(String[] args) /*throws IOException*/ {
        try {
            show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
