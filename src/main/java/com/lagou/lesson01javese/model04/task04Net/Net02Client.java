package com.lagou.lesson01javese.model04.task04Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Net02Client {
    public static void main(String[] args) {
        Socket s = null;
        PrintStream ps = null;
        Scanner sc = null;
        try {
            s = new Socket("127.0.0.1", 8800);
            System.out.println("连接服务器成功");
            ps = new PrintStream(s.getOutputStream());
            System.out.println("请输入你要发送的内容：");
            sc = new Scanner(System.in);
            String info = sc.next();

            ps.println(info);
            System.out.println("客户端发送信息成功");

            // 接收服务端发来的信息
            BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String res = bf.readLine();
            System.out.println("服务端端发来的是：" + res);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (s != null){
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (ps != null){
                ps.close();
            }
        }

    }
}
