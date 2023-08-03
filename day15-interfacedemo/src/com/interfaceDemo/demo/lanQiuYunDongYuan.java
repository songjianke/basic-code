package com.interfaceDemo.demo;

public class lanQiuYunDongYuan extends yunDongYuan {
    public lanQiuYunDongYuan() {
    }

    public lanQiuYunDongYuan(String name, int age) {
        super(name, age);
    }

    @Override
    public void xueXi() {
        System.out.println("篮球运动员在学习篮球");

    }
}
