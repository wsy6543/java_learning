package com.lagou.lesson01javese.model03.task03;

public class String01 {
    public static void main(String[] args) {
        String a = "dfkjas";
        System.out.println(a.length());

        StringBuilder b = new StringBuilder("djksjak");
        System.out.println(b);
        System.out.println(b.capacity());
        System.out.println(b.length());

        b.insert(4, "wsydjkfsadjfsjdsa");
        System.out.println(b);
        System.out.println(b.capacity());
        System.out.println(b.length());

        StringBuilder c = new StringBuilder("上海自来水来自海上1");
        c.reverse();
        System.out.println(c);
    }
}
