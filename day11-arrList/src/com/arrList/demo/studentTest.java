package com.arrList.demo;

import java.util.ArrayList;

public class studentTest {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("宋剑科", 29);
        Student s2 = new Student("余蓓芸", 27);

        list.add(s1);
        list.add(s2);


        for (int i = 0; i < list.size(); i++) {

            String name = list.get(i).getName();
            int age = list.get(i).getAge();

            System.out.println(name + "今年" + age + "岁");
        }


        System.out.println(findStudent(list,30));
    }


    public static boolean findStudent(ArrayList<Student> list,int age){

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);

            if (student.getAge() == age){

                return true;

            }



        }
        return false;
    }
}
