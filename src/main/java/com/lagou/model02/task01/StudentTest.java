package com.lagou.model02.task01;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.setAge(-10);
//        s.setName("wsy");
//        s.show();
//
//        int age = s.getAge();
//        String name = s.getName();
//        System.out.println(age + name);
//
//        // 构造方法封装
//        Student s2 = new Student(12, "yxf");
//        s2.show();
        System.out.println("请输入班级的人数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Student[] arr = new Student[num];

        for (int i = 0; i < num; i++) {
            System.out.println("请输入学生姓名");
            String name = sc.next();

            System.out.println("请输入学生年龄");
            int age = sc.nextInt();

            Student s = new Student(age, name);
            arr[i] = s;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i].show();
        }




    }
}
