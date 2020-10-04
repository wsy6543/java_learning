package com.lagou.model04.task02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Io03Copy {
    public static void main(String[] args) {

        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("/Users/wushengyu/Desktop/bigdt/src/main/java/com/lagou/model04/task01/file/abc.txt");
            fw = new FileWriter("/Users/wushengyu/Desktop/bigdt/src/main/java/com/lagou/model04/task01/file/cba.txt");
            int res =  0;
            System.out.println("玩命拷贝中");
            while((res = fr.read()) != -1){
                fw.write(res);

            }
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
