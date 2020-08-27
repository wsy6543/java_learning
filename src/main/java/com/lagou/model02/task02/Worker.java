package com.lagou.model02.task02;

public class Worker extends Person {
    private int salary;

    public Worker(){}

    public Worker(int age, String name, int salary){
        this.setAge(age);
        this.setName(name);
        this.setSalary(salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("wo ta ma de sha bi gong zuo");
    }

    public void show(){
        super.show();
        System.out.println("我的薪水是" + this.getSalary());
    }
}
