package com.lagou.lesson01javese.model01.model02.task01;

public class Reload {
    void show(){
        System.out.println("show -------------");
    }

    void show(int age){
        System.out.println("show " + age);
    }

    void show(String name){
        System.out.println("show " + name);
    }

    void show(String name, int age){
        System.out.println("show" + name + "show" + age);
    }

    Reload(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        Reload r = new Reload();
        r.show(30);

        Reload r2 = new Reload();

    }
}
