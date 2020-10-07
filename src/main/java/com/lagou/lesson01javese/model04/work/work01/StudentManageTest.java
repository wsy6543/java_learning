package com.lagou.lesson01javese.model04.work.work01;

import java.util.Scanner;

public class StudentManageTest {
    public static void main(String[] args) {
        System.out.println("欢迎来到学生系统");
        boolean is_quit = false;
        Scanner sc = new Scanner(System.in);
        StudentsManage sm = new StudentsManage();
        sm.loadData();
        while (is_quit == false){
            System.out.println("请选择操作 1增加学生，2删除学生，3修改学生，4查找学生，5遍历学生， 0退出系统");
            int action = sc.nextInt();
            if (action == 0){
                is_quit = true;
            } else if (action == 1){
                System.out.println("请输入添加学生的学号，年龄，姓名");
                int id = sc.nextInt();
                int age = sc.nextInt();
                String name = sc.next();

                try {
                    sm.addStudent(id, age, name);
                } catch (AgeExecption ageExecption) {
                    ageExecption.printStackTrace();
                } catch (IdExecption idExecption) {
                    idExecption.printStackTrace();
                }
            } else if (action == 2){
                System.out.println("请输入删除学生的学号");
                int id = sc.nextInt();
                sm.removeStudent(id);
            } else if (action == 3){
                System.out.println("请输入修改学生的学号，年龄，姓名");
                int id = sc.nextInt();
                int age = sc.nextInt();
                String name = sc.next();
                sm.updateStudent(id, age, name);
            } else if (action == 4){
                System.out.println("请输入要查找学生的学号");
                int id = sc.nextInt();
                sm.getStudent(id);
            } else if (action == 5){
                sm.iterStudent();
            }

        }
        sm.saveData();

        System.out.println("成功退出学生系统");
    }
}
