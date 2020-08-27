package com.lagou.model02.work;

public class ConversationPackage extends Package implements ConversationPackageInter {

    public ConversationPackage(){}

    public ConversationPackage(int talkTime, int msgNum, int monthFee){
        this.setFee(monthFee);
        this.setMsgNum(msgNum);
        this.setTalkTime(talkTime);
    }

    private int talkTime;
    private int msgNum;
//    private int monthFee;

    public int getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }

    public int getMsgNum() {
        return msgNum;
    }

    public void setMsgNum(int msgNum) {
        this.msgNum = msgNum;
    }

//    public int getMonthFee() {
//        return monthFee;
//    }
//
//    public void setMonthFee(int monthFee) {
//        this.monthFee = monthFee;
//    }

    public void show(){
        System.out.println("talk time is " + this.getTalkTime() + " msg num in " + this.getMsgNum() + " month fee is " + this.getFee());
    }

    public void HandInFee(){
        System.out.println("i am good man; i hand in fee on time");
    }
}
