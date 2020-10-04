package com.lagou.model04.work.work05;

import com.lagou.model04.work.work04.UserMessage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class TcpServiceGroup {
    public static void main(String[] args) {
        ServerSocket ss = null;
        try {
            System.out.println("启动服务端");
            ss = new ServerSocket(8090);
            System.out.println("客户端连接成功");

            ArrayList<Socket> sl = new ArrayList();


            while (true){
                System.out.println("开始处理新客户端请求");
                Socket s = ss.accept();
                sl.add(s);


                System.out.println("接收客户端信息");
                ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
                Message m  = (Message)ois.readObject();
                System.out.println(m);

                System.out.println("返回客户端信息");
                sl.forEach(item->{
                    System.out.println(item);

                    try {
                        ObjectOutputStream oos = new ObjectOutputStream(item.getOutputStream());
                        oos.writeObject(m);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });


                Thread.sleep(1000);
            }
        } catch (IOException | InterruptedException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

            if (ss != null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }




    }

}
