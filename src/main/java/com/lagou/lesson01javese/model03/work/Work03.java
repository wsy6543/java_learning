package com.lagou.lesson01javese.model03.work;

import java.util.HashMap;

public class Work03 {
    public static void main(String[] args) {
        String s = "123,456,789,123,456";
        String[] res = s.split(",");
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        for (int i = 0; i < res.length; i++) {
            if (h.containsKey(res[i])){
                h.put(res[i], h.get(res[i]) + 1);
            } else {
                h.put(res[i], 1);
            }
        }

        for (String i : h.keySet()) {
            System.out.println("");
            System.out.println( i + " 出现了 " + h.get(i) + " 次");
        }
    }
}
