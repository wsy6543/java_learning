package com.lagou.model01.tasks05;

import java.util.Scanner;

public class demo03ArrCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        int[] arr = new int[10];

        while(input > 0){
            arr[input % 10] ++;
            input = input / 10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("数字" + i + "出现了"+ arr[i] + "次");
        }
    }
}
