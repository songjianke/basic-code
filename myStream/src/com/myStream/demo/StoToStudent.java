package com.myStream.demo;

import java.util.ArrayList;
import java.util.Collections;

public class StoToStudent {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        Collections.addAll(arr,"zhangsan,21","lisi,22","wangwu,22","sjk,22");

        Student[] students = arr.stream().map(Student::new).toArray(Student[]::new);

        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getAge());
        }


    }
}
