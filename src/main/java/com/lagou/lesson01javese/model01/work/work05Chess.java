package com.lagou.lesson01javese.model01.work;

public class work05Chess {
    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            if (i == 0) {
                System.out.print(' ');
                for (int j = 0; j < 16; j++) {
                    String hex = Integer.toHexString(j & 0xFF);
                    System.out.print(hex);
                }
                System.out.println("");
            } else {
                String hex = Integer.toHexString(i & 0xFF);
                System.out.print(hex);
                System.out.println("++++++++++++++++");
            }
        }
    }
}
