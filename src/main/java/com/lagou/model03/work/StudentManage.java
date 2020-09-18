package com.lagou.model03.work;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class StudentManage {
    public static List<Student> studentList = new ArrayList<Student>();

    public static void addStudent(int id, int age, String name){
        Student s = new Student(id, name, age);
        studentList.add(s);
    }

    public static void removeStudent(int id){
        for (int i = 0; i < studentList.size(); i++) {
            Student s = studentList.get(i);
            if (s.getId() == id){
                studentList.remove(s);
            }
        }

    }

    public static void getStudent(int id){
        studentList.forEach(item->{
            if (item.getId() == id){
                item.show();
            }
        });
    }

    public static void updateStudent(int id, int age, String name){
        studentList.forEach(item->{
            if (item.getId() == id){
                item.setAge(age);
                item.setName(name);
            }
        });
    }

    public static void iterStudent(){
        studentList.forEach(item -> {
            item.show();
        });
    }
}
