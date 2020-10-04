package com.lagou.model04.task04Net;

import java.awt.desktop.SystemSleepEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Net01Service {
    public static void main(String[] args) {
        Socket s = null;
        ServerSocket ss = null;
        Scanner sc = null;
        PrintStream ps = null;

        try {
            ss = new ServerSocket(8800);
            System.out.println("开始连接");
            s = ss.accept();
            System.out.println("连接成功");
            s.getInputStream();

            BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String info = bf.readLine();
            System.out.println("客户端发来的是：" + info);

            // 服务端给客户端发送信息
            System.out.println("请输入你要给客户端发送的信息：");
            sc = new Scanner(System.in);
            String res = sc.next();
            ps = new PrintStream(s.getOutputStream());
            ps.println(res);





        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (s != null) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }

    }
}
