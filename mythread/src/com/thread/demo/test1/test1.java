package com.thread.demo.test1;

public class test1 {

    public static void main(String[] args) {

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();

        myThread1.setName("窗口1");
        myThread2.setName("窗口2");
        myThread3.setName("窗口3");

        myThread1.start();
        myThread2.start();
        myThread3.start();


    }
}
