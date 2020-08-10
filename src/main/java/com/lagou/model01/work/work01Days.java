package com.lagou.model01.work;

import java.util.Scanner;

public class work01Days {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = s.nextInt();
        System.out.println("请输入月份");
        int month = s.nextInt();
        System.out.println("请输入日期");
        int day = s.nextInt();

        int days = 0;
        int[] month_day_arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month_day = 0;

        for (int i = 0; i < month - 1; i++) {
            month_day = month_day + month_day_arr[i];
        }

        if (month > 2 && is_run_year(year)){
            month_day = month_day + 1;
        }

        days = day + month_day;
        System.out.println("这是一年中的第" + days + "天");
    }

    public static boolean is_run_year(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return true;
    }
}
