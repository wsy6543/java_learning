package com.lagou.model02.task01;

public class Person02 {
    int age = 0;
    String name = "china";

    void show(){
        System.out.println("my name is " + this.name + " my age is" + this.age);
    }

    Person02(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println("构造方法");
    }

    Person02(){

    }

    public static void main(String[] args) {
        Person02 p = new Person02(24, "wsy");
        p.show();

        Person02 p2 = new Person02(25, "wsy02");
        p2.show();

        Person02 p3 = new Person02();
        p3.show();

        Person02 p4 =null;
//        p4.show();


    }
}
