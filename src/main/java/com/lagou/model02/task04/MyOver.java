package com.lagou.model02.task04;

public class MyOver {
    public void show(int age){
        System.out.println(age);
    }

    public void show(String name){
        System.out.println("my name si " +name);
    }

    public static void main(String[] args) {
        MyOver m = new MyOver();

        m.show("dkjf");
    }
}
