package com.lagou.lesson01javese.model04.task03thread;

public class Thread06Mutil implements Runnable {
    private Integer money;
    private Demo dm = new Demo();

    public Thread06Mutil(Integer money) {
        this.money = money;
    }

    public Thread06Mutil() {
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("线程已启动" + t.getName() + " " + t.getId());
        synchronized (dm) {
            int tmp = getMoney();
            if (tmp > 200){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                tmp -= 200;
            }
            setMoney(tmp);
            System.out.println("当前的余额为" + getMoney());
        }

    }

    public static void main(String[] args) {
        Thread06Mutil ta = new Thread06Mutil(10000);
        Thread t1 = new Thread(ta);
        t1.start();
        Thread t2 = new Thread(ta);
        t2.start();
        Thread t3 = new Thread(ta);
        t3.start();
        Thread t4 = new Thread(ta);
        t4.start();
        Thread t5 = new Thread(ta);
        t5.start();


        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("账户的余额为" + ta.getMoney());
    }
}

class Demo{}