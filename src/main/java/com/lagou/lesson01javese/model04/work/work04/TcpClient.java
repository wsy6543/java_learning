package com.lagou.lesson01javese.model04.work.work04;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
    public static void main(String[] args) {
        System.out.println("开始连接");
        Socket s = null;
        Scanner sc = null;
        try {
            s = new Socket("127.0.0.1", 8090);
            System.out.println("连接成功");

            System.out.println("发送信息");
            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());

            sc  = new Scanner(System.in);
            System.out.println("请输入用户名");
            String name = sc.next();
            System.out.println("请输入密码");
            String pw = sc.next();
            User u = new User(name, pw);
            UserMessage um = new UserMessage(u);
            oos.writeObject(um);


            System.out.println("接收信息");
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
            try {
                um = (UserMessage)ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (um.getType().equals("success")){
                System.out.println("登录成功");
            } else {
                System.out.println("登录失败");
            }
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

            if (sc != null){
                sc.close();
            }
        }
    }
}
