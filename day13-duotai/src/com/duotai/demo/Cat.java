package com.duotai.demo;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food) {
        System.out.println(getAge() + "岁的" + getColor() + "的猫" + "在抱着" + food + "吃");

    }

    public void catchMouse() {

        System.out.println("猫在抓老鼠");
    }
}
