package com.testsystem.demo;

public class test01 {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 /1024);

        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
