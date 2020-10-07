package com.lagou.lesson01javese.model04.task01;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) throws AgeExecption {
        if (age < 0){
            throw new AgeExecption("年龄不能小于0");
        }
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name" + this.getName());
    }


}
