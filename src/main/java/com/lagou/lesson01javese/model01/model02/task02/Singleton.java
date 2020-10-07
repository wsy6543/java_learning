package com.lagou.lesson01javese.model01.model02.task02;

public class Singleton {
    private Singleton(){

    }

    private static Singleton sin = new Singleton();

    public static void setSin(Singleton sin) {
        Singleton.sin = sin;
    }

    public static Singleton getSin() {
        return sin;
    }
}
