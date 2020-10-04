package com.lagou.model04.work.work03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

public class ThreadFileCopy implements Callable {
    private String source;
    private String target;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public ThreadFileCopy(String source, String target) {
        this.source = source;
        this.target = target;
    }

    @Override
    public Object call() throws Exception {
        FileInputStream input = new FileInputStream(source);
        FileOutputStream output = new FileOutputStream(target);

        byte[] buf = new byte[1024];
        int infoLength;
        while ((infoLength = input.read(buf)) > 0){
            output.write(buf, 0, infoLength);
        }
        return true;
    }
}
