package com.duotai.demo;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food) {
        System.out.println(getAge() + "岁的" + getColor() + "的狗" + "在抱着" + food + "吃");
    }

    public void lookHome() {

        System.out.println("狗在看家");
    }
}
