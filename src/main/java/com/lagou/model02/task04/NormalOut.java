package com.lagou.model02.task04;

public class NormalOut {
    int out = 10;

    public class NormalInner{
        int inner = 100;

        public void show(){
            System.out.println("inner is " + inner + " out is " + out);
        }
    }
}
