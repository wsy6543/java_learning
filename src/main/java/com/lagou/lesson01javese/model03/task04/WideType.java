package com.lagou.lesson01javese.model03.task04;

import java.util.LinkedList;
import java.util.List;

public class WideType {
    public static void main(String[] args) {
        List<Integer> ls = new LinkedList<Integer>();
        ls.add(123);
        ls.add(456);
//        ls.add("dkfj");
        System.out.println(ls);
    }
}
