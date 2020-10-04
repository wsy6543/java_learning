package com.lagou.model04.work.work05;

public enum MessageType {


    FILETYPR("文件") {}, TEXTTYPR("文字") {};

    private final String desc; // 用于描述方向字符串的成员变量

    // 通过构造方法实现成员变量的初始化，更加灵活
    // 1.私有化构造方法，此时该构造方法只能在本类的内部使用
    private MessageType(String desc) { this.desc = desc; }

    // 通过公有的get方法可以在本类的外部访问该类成员变量的数值
    public String getDesc() {
        return desc;
    }

}
