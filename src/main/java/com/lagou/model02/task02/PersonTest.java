package com.lagou.model02.task02;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person(11, "wsy", "china");
        p1.show();

        Person p2 = new Person(12, "yxf", "japen");
        p2.show();

        System.out.println("===============static is share？======================");
        System.out.println(p1.getCountry());
        System.out.println(p2.getCountry());

        p1.test("nihao");
        p2.test("world");

    }
}
