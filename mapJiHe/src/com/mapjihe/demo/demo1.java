package com.mapjihe.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo1 {

    public static void main(String[] args) {

        Map<String,String>  map = new HashMap<>();

        map.put("一","yi");
        map.put("二","er");
        map.put("三","san");


        Set<String> key = map.keySet();
        System.out.println("-------增强for--------");
        for (String s : key) {
            String s1 = map.get(s);
            System.out.println(s1);
        }

        System.out.println("-------lambda--------");
        key.forEach(s -> System.out.println(map.get(s)));

        System.out.println("-------迭代器--------");
        Iterator<String> iterator = key.iterator();

        while (iterator.hasNext()){

            String next = iterator.next();

            System.out.println(map.get(next));
        }

    }
}
