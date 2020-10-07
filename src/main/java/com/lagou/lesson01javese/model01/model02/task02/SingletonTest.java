package com.lagou.lesson01javese.model01.model02.task02;

public class SingletonTest {

    public static void main(String[] args) {
//        Singleton s1 = new Singleton();
//
//        Singleton s2 = new Singleton();
//
//        System.out.println(s1 == s2);

        Singleton s1 = Singleton.getSin();
        Singleton s2 = Singleton.getSin();

        System.out.println(s1 == s2);

    }
}
