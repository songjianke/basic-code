package com.thread.demo.test2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test1 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        MyThreadPool aaa = new MyThreadPool();
        MyThreadPool bbb = new MyThreadPool();

        executorService.submit(aaa);
        executorService.submit(bbb);

        executorService.shutdown();

    }
}
