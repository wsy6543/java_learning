package com.lagou.lesson01javese.model01.model02.task03;

public class DogTest {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("ree", "yxf", 24);

        d1.show();

        d2.show();


        // 权限含义
        //                 本类   同一个包中的类  子类   其他类
        // public          ok     ok            ok    ok
        // protected       ok     ok            ok    no
        // default         ok     ok            no    no
        // private         ok     no            no    no


        final String wift = "yxf";
        System.out.println(wift);


    }
}
