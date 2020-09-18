package com.lagou.model03.interview;

public class in02String {
    public static void main(String[] args) {
        String a = "kjfdsa";
        System.out.println(a.hashCode());
        a = a + "d";
        System.out.println(a.hashCode());
        System.out.println(a);
    }

    // string 是线程安全吗？
    //  安全的
    // string 是finnal修饰，不可更改，更改之后就变成另外一个地址了
}
