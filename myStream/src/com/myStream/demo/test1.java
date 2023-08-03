package com.myStream.demo;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class test1 {


    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("张三,21");
        arrayList.add("张四,26");
        arrayList.add("张五,23");
        arrayList.add("张一一,25");

//        ArrayList<String> arrayList1 = new ArrayList<>();

//        arrayList.stream().filter(a->a.startsWith("张")).filter(a->a.length() == 3).forEach(a-> System.out.println(a));


        Map<String, Integer> collect =
                arrayList.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

        System.out.println(collect);

    }




}
