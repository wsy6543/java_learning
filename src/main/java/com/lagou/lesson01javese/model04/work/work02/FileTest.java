package com.lagou.lesson01javese.model04.work.work02;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        String url = "./src/main/java/com/lagou/model04/work/work02/store";
        deleteFile(url);
    }

    public static void deleteFile(String url){
        File f = new File(url);
        System.out.println(url);
        if (f.isDirectory()){
            File[] subfiles = f.listFiles();
            for (int i = 0; i < subfiles.length; i++) {
                File subf = subfiles[i];
                String fileName = url + "/" + subf.getName();
                deleteFile(fileName);

            }
        }
        f.delete();

    }


}

