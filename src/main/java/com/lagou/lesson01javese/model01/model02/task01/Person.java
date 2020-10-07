package com.lagou.lesson01javese.model01.model02.task01;

public class Person {
    String name;
    int age;

    void show(){
        System.out.println("my name is " + this.name + " my age is " + this.age);
    }

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    int getAge(){
        return this.age;
    }

    String getName(){
        return this.name;
    }

    void setAgeName(int age, String name){
        this.age = age;
        this.name = name;
    }

    int sum(int... arg){
        int res = 0;
        for (int i = 0; i < arg.length; i++) {
            res = res + arg[i];
        }
        return res;
    }

    Person(){
        System.out.println("初始化一个人");
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.age = 10;
        p.name = "djkfsa";

        p.show();
        System.out.println(p.age +  p.name);

        p.setName("wsy");
        p.setAge(25);
        p.show();


        p.setAgeName(20, "liuyif");
        p.show();

        int  res = p.sum(10,20, 30);
        System.out.println(res);


        System.out.println(p.getAge()+p.getName());
    }
}
