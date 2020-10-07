package com.lagou.lesson01javese.model01.model02.task03;

public class Dog extends Animal {
    private int tooth;

    public Dog(){

    }

    public Dog(String color, String name, int tooth){
        this.setTooth(tooth);
        this.setColor(color);
        this.setName(name);

    }

    public void setTooth(int tooth) {
        this.tooth = tooth;
    }

    public int getTooth() {
        return tooth;
    }

//    @Override
//    public void show() {
//        super.show();
//        System.out.println(" my tooth is" + this.tooth);
//    }
}
