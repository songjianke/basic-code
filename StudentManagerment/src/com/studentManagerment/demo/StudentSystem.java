package com.studentManagerment.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("------------------欢迎来到学生管理系统---------------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择：");

            Scanner scanner = new Scanner(System.in);
            String choose = scanner.next();

            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updaStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("输入错误，请重新输入");
            }
        }


    }


    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生的id：");
        String id = null;



        while (true) {
            id = sc.next();
            boolean flag = contains(list, id);
            if (flag){
                System.out.println("id已存在，请检查后重新输入：");
            }else {
                break;
            }
        }

        System.out.println("请输入学生的姓名：");
        String name = sc.next();
        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生的住址：");
        String address = sc.next();
        System.out.println("添加学生");

        Student student = new Student(id, name, age, address);
        list.add(student);

        System.out.println("添加成功！" );
    }


    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id：");
        String id = sc.next();
        //查询id在集合中的索引
        int index = getIndex(list, id);

        if(index >= 0){
            list.remove(index);
            System.out.println("删除学生成功");
        }else {
            System.out.println("id为" + id + "的学生不存在，删除失败");
        }


    }



    //修改学生
    public static void updaStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id：");
        String id = sc.next();

        int index = getIndex(list, id);

        if (index == -1 ){

            System.out.println("输入的学生id不存在，请重新输入");
            return;
        }

        //如果代码执行到这里，说明输入的id存在，执行修改逻辑

        Student student = list.get(index);

        System.out.println("请输入修改学生的姓名：");
        String newName = sc.next();
        System.out.println("请输入修改学生的年龄：");
        int newAge = sc.nextInt();
        System.out.println("请输入修改学生的住址：");
        String newAddress = sc.next();

        student.setId(id);
        student.setName(newName);
        student.setAge(newAge);
        student.setAddress(newAddress);

        System.out.println("修改成功");





    }


    //查询学生
    public static void queryStudent(ArrayList<Student> list) {

        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            //结束方法
            return;
        } else {
            System.out.println("id\t\t姓名\t年龄\t家庭住址");
            for (int i = 0; i < list.size(); i++) {
                String id = list.get(i).getId();
                String name = list.get(i).getName();
                int age = list.get(i).getAge();
                String address = list.get(i).getAddress();
                System.out.println(id + "\t\t" + name + "\t" + age + "\t" + address);

            }
        }

    }


    //判断id是否存在
    public static boolean contains(ArrayList<Student> list,String id){

        //先判断id是否存在，存在的话结束方法，不存在则继续执行后续代码
        /*for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {

                return true;
            }
        }
        return false;*/

        return getIndex(list, id) >= 0;

    }


    //查找id对应的索引
    private static int getIndex(ArrayList<Student> list, String id) {
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //取出每一个集合中学生对象的id与要查询的id对比
            if (list.get(i).getId().equals(id)){
                //如果id存在则直接返回索引
                return i;
            }
        }
        //如果id不存在则直接返回-1
        return -1;
    }


}
