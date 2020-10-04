package com.lagou.model04.work.work04;

import java.io.Serializable;

public class User implements Serializable {
    public User() {
    }

    public User(String name, String pw) {
        this.name = name;
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    private String name;
    private String pw;
}
