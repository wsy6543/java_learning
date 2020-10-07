package com.lagou.lesson01javese.model01.model02.task03;

public class Human implements Hunter {

    @Override
    public void hunter() {
        System.out.println("i am a good hunter");

    }

    @Override
    public void running() {
        System.out.println("i can run fast");
    }
}
