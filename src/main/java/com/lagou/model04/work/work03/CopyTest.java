package com.lagou.model04.work.work03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CopyTest {
    public static void main(String[] args) {
        String source = "./src/main/java/com/lagou/model04/work/work03/source";
        String target = "./src/main/java/com/lagou/model04/work/work03/target";
        ExecutorService es = Executors.newFixedThreadPool(5);
        try {
            deepCopy(source, target, es);
        } catch (IOException e) {
            e.printStackTrace();
        }
        es.shutdown();


    }

    public static void deepCopy(String source, String target, ExecutorService es) throws IOException {
        File sour = new File(source);
        File tar = new File(target);

        if (sour.isDirectory()){
            if (!tar.exists()) {
                tar.mkdir();
            }
            File[] ss = sour.listFiles();
            for (int i = 0; i < ss.length; i++) {
                File sonFile = ss[i];
                String newSource = source + "/" + sonFile.getName();
                String newTarget = target + "/" + sonFile.getName();
                deepCopy(newSource, newTarget, es);
            }
        } else {
            es.submit(new ThreadFileCopy(source, target));
        }

    }
}
