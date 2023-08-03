package com.listDieDai.demo;

import java.util.ArrayList;

public class DieDaiQi {
    public static void main(String[] args) {

        int a;
        

        ArrayList<String> coll = new ArrayList<>();

        coll.add("111");
        coll.add("222");
        coll.add("333");
        coll.add("444");

        System.out.println(coll );
/*        Iterator<String> ite = coll.iterator();
        //利用循环不断的去获取集合中的每个元素
        while (ite.hasNext()){
            //next方法做两件事情，获取元素并移动指针
            String next = ite.next();
            System.out.println(next);
        }*/

     /*   for (String s : coll) {

            System.out.println(s);
        }*/
        //coll.forEach();


        coll.forEach(System.out::println);
    }
}
