package com.mapjihe.demo;

import java.util.HashMap;
import java.util.Map;

public class demo3 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("一","yi");
        map.put("二","er");
        map.put("三","san");

        map.forEach(( s,  s2)-> {
                System.out.println(s);
                System.out.println(s2);
        });


    }
}
