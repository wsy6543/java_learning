package com.lagou.lesson01javese.model03.task03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date02 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);
    }
}
