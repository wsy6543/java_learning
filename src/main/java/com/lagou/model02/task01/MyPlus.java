package com.lagou.model02.task01;

public class MyPlus {
    int res = 1;


    void plus(int num){
//        for (int i = 1; i <= num; i++) {
//            System.out.println(i);
//            this.res *= i;
//        }
        if (num > 1){
            this.plus(num - 1);
            this.res = this.res * num;
        }

    }

    public static void main(String[] args) {
        MyPlus p = new MyPlus();
        p.plus(5);
        System.out.println(p.res);
    }
}
