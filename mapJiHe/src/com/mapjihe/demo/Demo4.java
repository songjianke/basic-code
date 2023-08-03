package com.mapjihe.demo;

import java.util.TreeMap;

public class Demo4 {
    public static void main(String[] args) {

        TreeMap<Student, String> s = new TreeMap<>();

        Student student1 = new Student("张三", 13);
        Student student2 = new Student("李四", 14);
        Student student3 = new Student("王五", 15);
        Student student4 = new Student("王五", 15);


        s.put(student1,"1");
        s.put(student2,"2");
        s.put(student3,"3");
        s.put(student4,"4");

        System.out.println(s);



    }

}
