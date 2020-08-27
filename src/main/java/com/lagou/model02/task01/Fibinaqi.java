package com.lagou.model02.task01;

public class Fibinaqi {

    int show(int num){
//        if (num == 1 || num == 2){
//            return 1;
//        }
//
//        return show(num -1) + show(num -2);


        int numa = 1;
        int numb = 1;
        int tmp = 0;
        for (int i = 3; i <= num; i++) {
            tmp = numb;
            numb = numa + numb;
            numa = tmp;

        }
        return numb;
    }


}

//1, 1, 2, 3, 5, 8, 13, 21, 33, 55