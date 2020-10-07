package com.lagou.lesson01javese.model01.model02.task02;

public class WorkerTest {
    public static void main(String[] args) {
        Person p1 = new Person();


        p1.setCountry("china");
        System.out.println(p1.getCountry());

        Worker w1 = new Worker();

        System.out.println(w1.getCountry());
        w1.show();
        w1.work();

    }


}
