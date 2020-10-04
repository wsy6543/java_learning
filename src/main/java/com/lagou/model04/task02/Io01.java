package com.lagou.model04.task02;

import java.io.FileWriter;
import java.io.IOException;

public class Io01 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("/Users/wushengyu/Desktop/bigdt/src/main/java/com/lagou/model04/task01/file/abc1.txt", true);
            fw.write("fjkdjskajkfdjksajfdk\n");
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null){
                try {
                    fw.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
