package com.lagou.model02.work;

public class NetPackage extends Package implements NetPackageInter{
    public NetPackage(){}

    public NetPackage(int flow, int fee) {
        this.flow = flow;
        this.setFee(fee);
    }


    private int flow;
//    private int fee;

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

//    public int getFee() {
//        return fee;
//    }
//
//    public void setFee(int fee) {
//        this.fee = fee;
//    }

    public void show(){
        System.out.println("my flow is " + this.getFlow() + " my fee is " + this.getFee());
    }

    public void HandInFee(){
        System.out.println("i am good man; i hand in fee on time");
    }
}
