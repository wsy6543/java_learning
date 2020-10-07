package com.lagou.lesson01javese.model04.work.work04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpService {
    public static void main(String[] args) {
        ServerSocket ss = null;
        try {
            System.out.println("启动服务端");

            ss = new ServerSocket(8090);
            System.out.println("客户端连接成功");


            while (true){
                System.out.println("开始处理新客户端请求");
                Socket s = ss.accept();

                System.out.println("接收客户端信息");
                ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
                UserMessage um  = (UserMessage)ois.readObject();
                System.out.println(um);

                System.out.println("返回客户端信息");
                if (um.getU().getName().equals("admin")  && um.getU().getPw().equals("123456") ){
                    um.setType("success");
                } else {
                    um.setType("fail");
                }
                ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
                oos.writeObject(um);

                Thread.sleep(1000);
            }
        } catch (IOException | InterruptedException | ClassNotFoundException e) {
            e.printStackTrace();
        }




    }
}
