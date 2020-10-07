package com.lagou.lesson01javese.model01.model02.task04;

public class DiretionTest {
    public static void test(String desc){
        switch (desc){
            case "向上":
                System.out.println(Direction.UP.getDesc());
                break;
            case "向下":
                System.out.println(Direction.DOWN.getDesc());
                break;
            case "向左":
                System.out.println(Direction.LEFT.getDesc());
                break;
            case "向右":
                System.out.println(Direction.RIGHT.getDesc());
                break;
            default:
                System.out.println("fuck");

        }

    }

    public static void  test2(Direction d){
        switch (d){
            case UP:
                System.out.println(Direction.UP.getDesc());
                break;
            case DOWN:
                System.out.println(Direction.DOWN.getDesc());
                break;
            case LEFT:
                System.out.println(Direction.LEFT.getDesc());
                break;
            case RIGHT:
                System.out.println(Direction.RIGHT.getDesc());
                break;
            default:
                System.out.println("fuck");

        }
    }


    public static void main(String[] args) {

//        Direction d1 = Direction.UP;
//        System.out.println("the direction is " + d1.getDesc());
        DiretionTest.test("向上");

        DiretionTest.test2(Direction.DOWN);


        Direction[] arr = Direction.values();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("------------------------");
            System.out.println(arr[i].toString());
            System.out.println(arr[i].getDesc());
            System.out.println(arr[i].ordinal());
        }



    }
}
