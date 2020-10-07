package com.lagou.lesson01javese.model04.task02;

import java.io.FileReader;
import java.io.IOException;

public class Io02Read {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("/Users/wushengyu/Desktop/bigdt/src/main/java/com/lagou/model04/task01/file/abc1.txt");
/*            int res = fr.read();
            System.out.println("读取到的结果是：" + (char)res);*/
//            while (fr.read() != 0){
//                System.out.println((char)fr.read());
//            }

            char[] cha = new char[10];
            int res = fr.read(cha);
            for (char c : cha) {
                System.out.println(c);
            }



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
