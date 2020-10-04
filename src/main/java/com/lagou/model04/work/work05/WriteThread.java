package com.lagou.model04.work.work05;

import com.lagou.model04.work.work04.User;
import com.lagou.model04.work.work04.UserMessage;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class WriteThread extends Thread {
    private Socket s;

    public WriteThread(Socket s) {
        this.s = s;
    }

    public Socket getS() {
        return s;
    }

    public void setS(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        Scanner sc = null;
        ObjectOutputStream oos = null;
        System.out.println("开启写线程");
        try {
            oos = new ObjectOutputStream(s.getOutputStream());
            sc  = new Scanner(System.in);

        } catch (IOException e) {
            e.printStackTrace();
        }


        while (true){
            System.out.println("请输入类型(1:文件， 2文字)");
            Message m = new Message();
            int type = sc.nextInt();
            if (type == 1) {
                m.setType( MessageType.FILETYPR);
                System.out.println("请输入文件url");
                m.setUrl(sc.next());

            } else {
                m.setType(MessageType.TEXTTYPR);
                System.out.println("请输入文字");
                m.setText(sc.next());
            }
            if (oos != null){
                try {
                    oos.writeObject(m);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("消息发送成功");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
