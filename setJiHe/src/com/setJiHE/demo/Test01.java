package com.setJiHE.demo;

import java.util.HashSet;
import java.util.Iterator;

public class Test01 {
    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();

        Student student = new Student("张三",15);
        Student student2 = new Student("李四",15);
        Student student3 = new Student("李四",15);

        students.add(student);
        students.add(student2);
        students.add(student3);

        System.out.println(students);

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next);
        }


    }
}
