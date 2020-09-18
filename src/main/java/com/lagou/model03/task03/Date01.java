package com.lagou.model03.task03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws Exception{
        System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);

        Date d1 = new Date(100);
        System.out.println(d1);

        Date d2 = new Date(System.currentTimeMillis());
        System.out.println(d2);

        long desc = d2.getTime();
        System.out.println(desc);

        d2.setTime(1000);
        System.out.println(d2);

        SimpleDateFormat f1 = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        String d2_f = f1.format(d2);
        System.out.println(d2_f);

        Date d3 = f1.parse(d2_f);

        System.out.println(d3);

        Calendar ca = Calendar.getInstance();
        ca.set(2020, 10,1,22,22,22);

        Date cad = ca.getTime();

        System.out.println(ca);
        System.out.println(cad);



    }
}
