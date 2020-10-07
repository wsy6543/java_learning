package com.lagou.lesson01javese.model04.task02;

import java.io.*;

public class Io04Img {
    public static void main(String[] args) {
        FileInputStream fr = null;
        FileOutputStream fw = null;
        try {
            fr = new FileInputStream("/Users/wushengyu/Desktop/bigdt/src/main/java/com/lagou/model04/task01/file/abc.png");
            fw = new FileOutputStream("/Users/wushengyu/Desktop/bigdt/src/main/java/com/lagou/model04/task01/file/cba.png");
            int res =  0;
            System.out.println("玩命拷贝中");
            // 一字节一个字节拷贝效率太低，
/*            while((res = fr.read()) != -1){
                fw.write(res);

            }*/

            byte[] arr = new byte[fr.available()];
            res = fr.read(arr);
            fw.write(arr);
            System.out.println("拷贝成功");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
