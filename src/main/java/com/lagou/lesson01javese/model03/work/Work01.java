package com.lagou.lesson01javese.model03.work;

import java.util.Arrays;

public class Work01 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        String s =  "ABCD123!@#$%ab";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('A' <= c  && c <= 'Z'){
                arr[0] ++;
            } else if ( 'a'<=c && c <='z'){
                arr[1] ++;
            } else if ( '0' <= c && c <='9'){
                arr[2] ++;
            } else {
                arr[3] ++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
