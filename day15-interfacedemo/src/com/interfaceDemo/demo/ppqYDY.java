package com.interfaceDemo.demo;

public class ppqYDY extends yunDongYuan implements speak{

    public ppqYDY() {
    }

    public ppqYDY(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }

    @Override
    public void xueXi() {
        System.out.println("乒乓球运动员在学习乒乓球");
    }
}
