package com.myStream.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentToStr {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("sjk",23));
        students.add(new Student("ssjk",23));
        students.add(new Student("sssjk",23));


        String[] strings = students.stream().map(Student::toString).toArray(String[]::new);

        System.out.println(Arrays.toString(strings));


    }
}
