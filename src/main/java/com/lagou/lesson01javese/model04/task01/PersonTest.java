package com.lagou.lesson01javese.model04.task01;

public class PersonTest {
    public static void main(String[] args) {
        Person p = null;
        try {
            p = new Person(-6, "djkfa");
        } catch (AgeExecption ageExecption) {
            ageExecption.printStackTrace();
        }
        p.show();
    }
}
