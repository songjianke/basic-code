package com.mapjihe.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo2 {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("一","yi");
        map.put("二","er");
        map.put("三","san");

        System.out.println("---------------");
        Set<Map.Entry<String, String>> entries = map.entrySet();

        System.out.println("-------lambda--------");

        entries.forEach( stringStringEntry-> {
                System.out.println(stringStringEntry.getKey());
                System.out.println(stringStringEntry.getValue());
        });

        System.out.println("-------迭代器--------");
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();

        while (iterator.hasNext()){

            Map.Entry<String, String> next = iterator.next();

            System.out.println(next.getKey());
            System.out.println(next.getValue());
        }

        System.out.println("-------增强for--------");

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }



}
