package com.lagou.lesson01javese.model03.work;

import java.util.*;

public class Work05 {
    public static void main(String[] args) {
        HashMap<Integer, String> pk = new HashMap<Integer, String>();
        // 生成牌
        pk.put(1, "king");
        pk.put(2, "queen");
        String[] colorArr = {"梅花", "红心", "方块", "黑桃"};
        String[] numArr = {"2", "A", "k", "q", "j", "10", "9", "8", "7", "6", "5", "4", "3"};
        for (int i = 0; i < numArr.length; i++) {
            for (int i1 = 0; i1 < colorArr.length; i1++) {
                String card = colorArr[i1] + numArr[i];
                pk.put(pk.size() + 1, card);
            }
        }

        // 洗牌
        List<Integer> pkIndex = new ArrayList<Integer>(pk.keySet());
        Collections.shuffle(pkIndex);

        List<Integer> u1 = new ArrayList<Integer>();
        List<Integer> u2 = new ArrayList<Integer>();
        List<Integer> u3 = new ArrayList<Integer>();
        List<Integer> left = new ArrayList<Integer>();


        // 发牌
        for (int i = 0; i < pkIndex.size(); i++) {
            if (i < pkIndex.size()-3){
                if (i % 3 == 0){
                    u1.add(pkIndex.get(i));
                } else if (i % 3 == 1){
                    u2.add(pkIndex.get(i));
                } else if (i % 3 == 2){
                    u3.add(pkIndex.get(i));
                }
            } else {
                left.add(pkIndex.get(i));
            }

        }

        // 插牌
        Collections.sort(u1);
        Collections.sort(u2);
        Collections.sort(u3);

        // 展示
        show(u1, pk, 1);
        show(u2, pk, 1);
        show(u3, pk, 1);
        show(left, pk, 2);
    }

    public static void show(List cards, HashMap pk, Integer type){
        if (type == 1){
            System.out.print("玩家的牌是：");

        } else {
            System.out.print("底牌是：");
        }


        cards.forEach(item->{
            System.out.print(" " + pk.get(item));
        });
        System.out.println("");
    }

}
