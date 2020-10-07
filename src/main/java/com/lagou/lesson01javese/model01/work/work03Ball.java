package com.lagou.lesson01javese.model01.work;

import java.util.Arrays;

public class work03Ball {
    public static void main(String[] args) {

        int blueLen = 16;
        int redLen = 33;

        int blue = (int)(Math.random() * blueLen + 1);
        int[] red_arr = new int[6];
        int i = 0;

        while (i < 6){
            int red = (int)(Math.random() * redLen + 1);
            if (Arrays.binarySearch(red_arr, red) < 0){
                red_arr[i] = red;
                i ++;
            }
        }

        System.out.println("blue ball is：" + blue + "  red balls are： " + Arrays.toString(red_arr));


    }
}
