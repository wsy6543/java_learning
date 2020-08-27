package com.lagou.model02.work;

public enum CardType {
    MICRO("微型"),
    SMALL("小卡"),
    BIG("大卡");

    private final String desc;

    private CardType(String desc){
        this.desc = desc;
    }
}
