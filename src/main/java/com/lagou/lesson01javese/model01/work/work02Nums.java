package com.lagou.lesson01javese.model01.work;

public class work02Nums {
    public static void main(String[] args) {
        for (int i=0; i<1000; i++){
            if (is_full_num(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean is_full_num(int num){
        int sum = 0;
        for (int i=1; i<num; i++){
            if (num % i == 0){
                sum += i;
            }
        }

        if (num == sum){
            return true;
        }
        return false;
    }
}
