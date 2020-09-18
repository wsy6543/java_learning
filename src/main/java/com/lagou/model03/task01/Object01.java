package com.lagou.model03.task01;

import javafx.css.CssParser;

public class Object01 {
    public static void main(String[] args) {
        Person p1 = new Person(100);
        Person p2 = new Person(100);
        System.out.println(p1.equals(p2));


        Person a = null;
        System.out.println(a instanceof Person);


        System.out.println(p1.hashCode() + "-----" +p2.hashCode());
        System.out.println(p1);

        System.out.println(p1.toString() + "-----" +p2.toString());


        Integer myin1 = Integer.valueOf(1000);
        System.out.println(myin1);

        double x = 3.1415;
        double y = 9.998;
        int x2 = 10;
        double y2=5.0;
        System.out.println( x * y);
        System.out.println((double)x2/y2);

        String wsy = "good man";
        String wsy2 = new StringBuffer(wsy).reverse().toString();
        System.out.println(wsy.equals(wsy2));

        String wsy3 = "上海自来水来自海上";
        String wsy4 = new StringBuffer(wsy3).reverse().toString();
        System.out.println(wsy3);
        System.out.println(wsy4);
        System.out.println(wsy4.equals(wsy4));
    }

}
