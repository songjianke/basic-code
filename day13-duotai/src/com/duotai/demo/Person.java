package com.duotai.demo;

public class Person {

    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public void keepPet(Animal a, String food) {


        if (a instanceof Dog d) {

            System.out.println("年龄为" + this.age + "岁的" + this.name + "养了一只" + d.getColor() + "的" + d.getAge() + "岁的狗");
            d.eat(food);
            d.lookHome();

        } else if (a instanceof Cat c) {
            System.out.println("年龄为" + this.age + "岁的" + this.name + "养了一只" + c.getColor() + "的" + c.getAge() + "岁的狗");
            c.eat(food);
            c.catchMouse();
        }

    }
}
