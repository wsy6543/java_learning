package com.lagou.model02.task04;

public enum  Direction {

    UP("向上"),
    DOWN("向下"),
    LEFT("向左"),
    RIGHT("向右");

    private final String desc;

    private Direction(String desc){
        this.desc = desc;
    }






//    public static final Direction UP = new Direction("向上");
//    public static final Direction DOWN = new Direction("向下");
//    public static final Direction LEFT = new Direction("向左");
//    public static final Direction RIGHT = new Direction("向右");



    public String getDesc() {
        return desc;
    }
}
