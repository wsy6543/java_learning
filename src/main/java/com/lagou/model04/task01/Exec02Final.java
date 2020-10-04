package com.lagou.model04.task01;

import java.io.IOException;
import java.lang.module.FindException;

public class Exec02Final {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int c = a / b;
        }catch (FindException e){
            e.printStackTrace();
        }finally {
            System.out.println("djfkkjd");
        };
    }
}
