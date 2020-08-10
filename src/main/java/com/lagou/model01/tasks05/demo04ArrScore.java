package com.lagou.model01.tasks05;

import java.util.Arrays;
import java.util.Scanner;

public class demo04ArrScore {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int num = s.nextInt();
//        int[] arr = new int[num];
//
//
//        for (int i = 0; i < arr.length; i++) {
//            int score = s.nextInt();
//            arr[i] = score;
//        }
//
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("第" + i + "个学生的成绩为" + arr[i]);
//        }
//
//        System.out.println("===========计算总分和平均分===============");

        int[] arr = {11,2,33,44};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 33));

        System.out.println(Arrays.toString(arr));
        System.out.println(arr);

        Arrays.fill(arr, 10);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {10, 10, 10, 10};
        System.out.println(Arrays.equals(arr2, arr));



    }
}
