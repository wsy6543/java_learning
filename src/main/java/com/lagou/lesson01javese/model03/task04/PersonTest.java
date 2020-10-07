package com.lagou.lesson01javese.model03.task04;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person<Integer>("jkfds", 12,  0);
        System.out.println(p1.getSex());

        Person p2 = new Person<String>("jkfds", 12,  "girle");
        System.out.println(p2.getSex());

        Person p3 = new Person<String>();
        p3.setSex("kjdf");
        System.out.println(p3.getSex());

        Integer[] a = new Integer[10];
        Person.printArr(a);
    }
}
