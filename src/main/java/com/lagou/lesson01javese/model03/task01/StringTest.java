package com.lagou.lesson01javese.model03.task01;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String user;
        String pw;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入账号密码");
            user = sc.next();
            pw = sc.next();
            if ("admin".equals(user) & "123456".equals(pw)){
                System.out.println("登录成功，欢迎使用");
                break;
            } else {
                if (i==2){
                    System.out.println("账号已冻结");
                } else{
                    System.out.println("登录失败你还有" + (3-i-1) + "次机会" );

                }
            }
        }
        sc.close();


    }
}
