package com.itheima1;

public class StudentTest {

    public static void main(String[] args) {

        Student[] arr = new Student[3];

        Student s1 = new Student(12, "张三", 13);
        Student s2 = new Student(13, "李四", 14);
        Student s3 = new Student(14, "王五", 53);


        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        Student s4 = new Student(15, "王五", 53);

    }
}
