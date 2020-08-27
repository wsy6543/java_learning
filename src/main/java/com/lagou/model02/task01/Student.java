package com.lagou.model02.task01;

public class Student {
    private String name;
    private int age;

    public Student(int age, String name){
        setName(name);
        setAge(age);
    }

    public Student(){

    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age<0){
            System.out.println("学号不合理");
        } else {
            this.age = age;
        }

    }

    public void show(){
        System.out.println("my name is " + getName() + " my age " + getAge());
    }
}
