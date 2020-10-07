package com.lagou.lesson01javese.model01.model02.work;

import java.util.Arrays;

public class Work01Arr {
    public static void main(String[] args) {
        int[][] arr = new int[16][16];

        // 给arr赋值，100中取随机数
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (10 + Math.random() * (100));
            }
        }

        // 打印二维数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        // 所有行的和
        int[] sum1 = new int[16];
        for (int i = 0; i < arr.length; i++) {
            sum1[i] = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum1[i] += arr[i][j];
            }

        }
        System.out.println("所有行的和: " + Arrays.toString(sum1));

        // 所有列的和
        int[] sum2 = new int[16];
        for (int i = 0; i < arr.length; i++) {
            sum2[i] = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum2[i] += arr[j][i];
            }

        }
        System.out.println("所有列的和: " + Arrays.toString(sum2));


        // 左上角到右下角
        int sum3 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum3 += arr[i][i];
        }
        System.out.println("左上角到右下角: " + sum3);

        // 右上角到左下角
        int sum4 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum4 += arr[i][arr.length - i - 1];
        }
        System.out.println("右上角到左下角: " + sum4);
    }
}
