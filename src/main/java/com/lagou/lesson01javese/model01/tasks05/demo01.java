package com.lagou.lesson01javese.model01.tasks05;

public class demo01 {
    public static void main(String[] args) {



        // 直接声明元素

        float[] f1 = new float[5];
        double[] f2 = {23.0, 32.4, 34.4};
        System.out.println(f2.length);
        // f2[3] = 23.5;                           // 数组无法添加item
        // System.out.println(f2.length);


        int[] arr = new int[5];

        for (int i = 0; i < arr.length - 1; i++) {
            String j =Integer.toString(i+1);
            arr[i] = Integer.parseInt(j+j);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

