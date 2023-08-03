package com.abstractdemo.demo;

public class test {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("小狗");
        dog.setAge(5);

        System.out.println("名叫" + dog.getName()+ dog.getAge() );

        dog.eat();

        String a = "2023-01-01";

        System.out.println(a.substring(0,4));

    }




}
