package com.lagou.model03.interview;

public class In01String {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        s2 = s2.intern();

        System.out.println(s2.intern());
        System.out.println( s1.equals(s2) );
        System.out.println( s1==s2 );

    }
}
