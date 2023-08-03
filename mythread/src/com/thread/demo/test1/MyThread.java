package com.thread.demo.test1;

public class MyThread extends Thread {

    static int count = 1;

    @Override
    public void run(){
        while (true) {
            synchronized (MyThread.class) {
                if (count > 10) {
                    System.out.println("票卖完啦");
                    break;
                } else {
                    System.out.println(getName() + "正在卖第" + count + "张票");
                    count++;
                }
            }
        }
    }
}
