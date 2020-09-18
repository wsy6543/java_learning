package com.lagou.model03.work;

public class Work02 {
    public static void main(String[] args) {
        String s1="asdafghjka";
        String s2="aaasdfg";
        // 自己写的O(n^2)
        String sub = getMaxSubString(s1, s2);

        System.out.println("最大的子串是" + sub);

    }

    public static String getMaxSubString(String s1, String s2){
        for (int i = s2.length(); i >= 1; i--) {
            int l = 0;
            while (l + i <= s2.length()){
                String sub = s1.substring(l, i+l);
                if (s2.contains(sub)){
                    return sub;
                }
                l ++;
            }
        }
        return "";
    };


}
