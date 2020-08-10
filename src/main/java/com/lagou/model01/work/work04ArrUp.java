package com.lagou.model01.work;

import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

public class work04ArrUp {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 1000; i ++){
            arr[i] = i;
            if ((float)i / arr.length > 0.8){
                arr = arrUp(arr);
            }
        }
    }

    public static int[] arrUp(int[] arr) {
        int[] newArr = new int[(int)(arr.length * 1.5)];
        System.arraycopy(arr, 0 , newArr, 0, arr.length);
        System.out.println("原来数组长度:" + arr.length + ",扩长之后的数组长度:" + newArr.length);
        return newArr;
    }


}
