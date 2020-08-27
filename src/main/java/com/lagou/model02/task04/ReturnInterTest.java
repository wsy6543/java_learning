package com.lagou.model02.task04;

public class ReturnInterTest {

    static void test(ReturnInter re){
        re.show();
    }

    public static void main(String[] args) {

//        class Retrun implements ReturnInter{
//            @Override
//            public void show() {
//                System.out.println("hello word");
//            }
//        }
//
//
//        Retrun re  = new Retrun();

        ReturnInter re  = new ReturnInter() {
            @Override
            public void show() {
                System.out.println("hello word ");
            }
        };
        ReturnInterTest.test(re);

    }
}
