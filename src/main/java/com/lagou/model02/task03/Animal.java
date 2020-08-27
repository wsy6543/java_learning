package com.lagou.model02.task03;

public class Animal {
    private String name;
    private String color;

    public Animal(){

    }

    public Animal(String name, String color){
        this.setColor(color);
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public  final void show(){
        System.out.println("my name is " + this.getName() + " my color is " + this.getColor());
    }
}
