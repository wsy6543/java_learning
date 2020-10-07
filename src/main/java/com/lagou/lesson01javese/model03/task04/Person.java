package com.lagou.lesson01javese.model03.task04;

public class Person<E> {
    private String name;
    private int age;
    private E sex;

    public Person() {
    }

    public Person(String name, int age, E sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public E getSex() {
        return sex;
    }

    public void setSex(E sex) {
        this.sex = sex;
    }

    static <T1> void printArr(T1[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
