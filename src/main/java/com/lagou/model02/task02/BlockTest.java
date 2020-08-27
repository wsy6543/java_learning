package com.lagou.model02.task02;

public class BlockTest {

    {
        System.out.println("构造块");
    }

    static {
        System.out.println("静态代码块");
    }

    public BlockTest(){
        System.out.println("构造方法体");
    }

    public static void main(String[] args) {
        BlockTest b = new BlockTest();
        BlockTest b2 = new BlockTest();


    }
}
