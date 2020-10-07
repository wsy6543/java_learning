package com.lagou.lesson01javese.model01.model02.task02;

public class Person {
    private int age;
    private String name;
    private static String country;

    public Person(){

    }

    public Person(int age, String name, String country){
        setAge(age);
        setCountry(country);
        setName(name);
    }

    public static void test(String name){
        System.out.println("this is a static method" + name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void show(){
        System.out.println("my name is " + this.name + " my age is " + this.age + " i am from " + this.country);
    }

    private void happy(){
        System.out.println("i am good i can change the word");
    }

}
