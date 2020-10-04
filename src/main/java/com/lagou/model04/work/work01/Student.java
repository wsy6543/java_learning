package com.lagou.model04.work.work01;

public class Student implements java.io.Serializable {
    private int  id;
    private String name;
    private int age;

    public Student(int id, String name, int age) throws AgeExecption, IdExecption {
        this.setAge(age);
        this.setId(id);
        this.setName(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws IdExecption {
        if (id < 0){
            IdExecption execption = new IdExecption("id不能为负数");
            throw execption;
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeExecption {
        if (age < 0){
            AgeExecption execption = new AgeExecption("年龄不能为负数");
            throw execption;
        }
        this.age = age;
    }

    public void show(){
        System.out.println("我的学号是: " + this.getId() + " 我的年龄是：" + this.getAge() + " 我的名字是：" + this.getName());
    }
}
