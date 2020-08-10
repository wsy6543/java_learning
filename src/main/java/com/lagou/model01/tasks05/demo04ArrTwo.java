package com.lagou.model01.tasks05;

public class demo04ArrTwo {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                System.out.println(arr[i][i1]);
            }
        }
    }
}
