package com.lagou.lesson01javese.model01.tasks05;

public class demo02 {
    public static void main(String[] args) {
        int[] arr1 = {11,22,33,44,55};
        int[] arr2 = new int[3];
        for (int i = 1; i < arr1.length-1; i++) {
            arr2[i-1] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.arraycopy(arr1, 1, arr2, 0, 3);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
