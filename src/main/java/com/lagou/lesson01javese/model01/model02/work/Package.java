package com.lagou.lesson01javese.model01.model02.work;

public abstract class Package {
    private int fee;

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    abstract void show();
}
