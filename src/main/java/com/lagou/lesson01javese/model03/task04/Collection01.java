package com.lagou.lesson01javese.model03.task04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Collection01 {
    public static void main(String[] args) {
        Collection arr = new ArrayList();
        System.out.println(arr);

        arr.add("kjdfjask");
        System.out.println(arr);

        arr.add(123);
        System.out.println(arr);

        arr.addAll(arr);
        System.out.println(arr);

        boolean res =  arr.contains(123);
        System.out.println(res);

        boolean conAll = arr.containsAll(arr);
        System.out.println(conAll);


        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(345);
        System.out.println(Arrays.toString(coll.toArray()));

        Iterator iter = coll.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());

        }


        for (Object obj: coll){
            System.out.println(obj);
        }


    }
}
