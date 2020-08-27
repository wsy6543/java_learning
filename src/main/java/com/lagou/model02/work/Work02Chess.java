package com.lagou.model02.work;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Work02Chess {

    public Work02Chess(int[][] arr) {
        if (arr.length <= 5){
            System.out.printf("棋盘太小了");
            return;
        }
        this.arr = arr;
    }

    private int[][] arr;

    public int[][] getArr() {
        return arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }

    public boolean win(){
        for (int i = 2; i < arr.length - 2; i++) {
            for (int j = 2; j < arr[0].length - 2; j++) {
                if (arr[i][j]==0){
                    continue;
                }
                boolean a = arr[i][j] == arr[i+i][j]  &&  arr[i][j] == arr[i+2][j] && arr[i][j] == arr[i-1][j] && arr[i][j] == arr[i-2][j];
                boolean b = arr[i][j] == arr[i][j+1]  &&  arr[i][j] == arr[i][j+2] && arr[i][j] == arr[i][j-1] && arr[i][j] == arr[i][j-2];
                boolean c = arr[i][j] == arr[i+i][j+1]  &&  arr[i][j] == arr[i+2][j+2] && arr[i][j] == arr[i-1][j-1] && arr[i][j] == arr[i-2][j-2];
                boolean d = arr[i][j] == arr[i+i][j-1]  &&  arr[i][j] == arr[i+2][j-2] && arr[i][j] == arr[i-1][j+1] && arr[i][j] == arr[i-2][j+2];

                if (a || b || c || d){
                    if (arr[i][j] == -1){
                        System.out.println("红方 win");
                    } else {
                        System.out.println("黑方 win");
                    }

                    return true;
                }

            }
        }
        return false;
    }

    public void play(int num, Scanner s){
        int x;
        int y;
        boolean has_play = false;
        while(!has_play){
            if (num == -1){
                System.out.println("请红方下子，输入x");
                x = s.nextInt()-1;
                System.out.println("请红方下子，输入y");
                y = s.nextInt()-1;
            } else {
                System.out.println("请黑方下子，输入x");
                x = s.nextInt()-1;
                System.out.println("请黑方下子，输入y");
                y = s.nextInt()-1;
            }
            if (this.arr[x][y] != 0){
                System.out.println("该位置不能下棋，重下");
            } else {
                try{
                    this.arr[x][y] = num;
                    has_play = true;
                }
                catch (IndexOutOfBoundsException e){
                    System.out.println("该位置不能下棋, 重下");
                }

            }
        }
    }

    public void show(){
        for (int i = 0; i < this.arr.length; i++) {
            System.out.println(Arrays.toString(this.arr[i]));
        }
    }


    public static void main(String[] args) {
        // 初始化30*30棋盘， -1 为红方，1为黑方
        int[][] arr = new int[30][30];
        Work02Chess c = new Work02Chess(arr);
        c.show();
        int x;
        int y;

        Scanner s = new Scanner(System.in);
        System.out.println("五子棋开始");
        int turn = -1;
        while ( !c.win() ){
            c.play(turn, s);
            turn *= -1;
            c.show();

        }
    }
}
