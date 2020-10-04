package com.lagou.model04.work.work04;

import java.io.Serializable;

public class UserMessage implements Serializable {
    private User u;
    private String type;

    public UserMessage(User u) {
        this.u = u;
    }

    public UserMessage(User u, String type) {
        this.u = u;
        this.type = type;
    }

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "username:" + this.getU().getName() + " pw:" + this.getU().getPw();
    }
}
