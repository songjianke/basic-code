package com.thread.demo.test2;

public class MyThreadPool implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "运行第" + i +"次");
        }

    }
}
