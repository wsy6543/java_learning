package com.lagou.lesson01javese.model04.work.work05;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client02 {
    public static void main(String[] args) {
        System.out.println("开始连接");
        Socket s = null;
        Scanner sc = null;
        try {
            s = new Socket("127.0.0.1", 8090);
            System.out.println("连接成功");

            // 多线程处理
            Thread rt = new ReaderThread(s);
            Thread wt = new WriteThread(s);
            wt.run();
            rt.run();

            wt.join();


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (s != null){
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (sc != null){
                sc.close();
            }


        }
    }
}
