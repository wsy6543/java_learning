package com.lagou.lesson01javese.model01.model02.task04;

public class NormalOutTest {
    public static void main(String[] args) {

        NormalOut no = new NormalOut();
        NormalOut.NormalInner ni = no.new NormalInner();

        ni.show();

    }
}
