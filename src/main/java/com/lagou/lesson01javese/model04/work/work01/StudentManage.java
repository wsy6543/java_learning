package com.lagou.lesson01javese.model04.work.work01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class StudentsManage {
    public static List<Student> studentList = new ArrayList<Student>();
    private String url = "./src/main/java/com/lagou/model04/work/work01/student_obj.txt";

    public static void addStudent(int id, int age, String name) throws AgeExecption, IdExecption {
        Student s = new Student(id, name, age);
        studentList.add(s);
    }

    public String getUrl(){
        return url;
    }

    public  void loadData(){
        ObjectInputStream objStream = null;
        try {
            objStream = new ObjectInputStream(new FileInputStream(getUrl()));
            studentList = (List<Student>) objStream.readObject();
            System.out.println(studentList);
            studentList.forEach(item ->{
                System.out.println(item);
            });

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (objStream != null){
                try {
                    objStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    };

    public void saveData(){
        ObjectOutputStream objSream = null;
        try {
            objSream = new ObjectOutputStream(new FileOutputStream(getUrl()));
            objSream.writeObject(studentList);
            System.out.printf("保存成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (objSream != null){
                try {
                    objSream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    };

    public void removeStudent(int id){
        for (int i = 0; i < studentList.size(); i++) {
            Student s = studentList.get(i);
            if (s.getId() == id){
                studentList.remove(s);
            }
        }

    }

    public void getStudent(int id){
        studentList.forEach(item->{
            if (item.getId() == id){
                item.show();
            }
        });
    }

    public void updateStudent(int id, int age, String name) {
        studentList.stream().filter(item -> item.getId() == id).forEach(item -> {
            try {
                item.setAge(age);
            } catch (AgeExecption ageExecption) {
                ageExecption.printStackTrace();
            }
            item.setName(name);
        });
    }

    public void iterStudent(){
        studentList.forEach(item -> {
            item.show();
        });
    }
}
