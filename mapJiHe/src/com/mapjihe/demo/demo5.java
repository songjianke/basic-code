package com.mapjihe.demo;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class demo5 {

    public static void main(String[] args) {

        String s = "fasdfadgasdfsafasdfasdadsfasdfasdfasdfasdfadfasdasdadfadfasdfasdfasdfasdfasdfasfasdfasdfasdfasdfasdfasdfasdfasdfasdfsadfasdfasdfasdfasdfasdfafdasadf";

        int length = s.length();

        char[] chars = s.toCharArray();

        TreeMap<Character, Integer> treeMap = new TreeMap<>();

        for (char aChar : chars) {

            if (treeMap.containsKey(aChar)){
                Integer count = treeMap.get(aChar);
                count ++;
                treeMap.put( aChar,count);

            }else {
                treeMap.put(aChar,1);
            }
        }


        StringBuilder sb = new StringBuilder();

        treeMap.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character character, Integer integer) {
                 sb.append(character).append("(").append(integer).append(")");
            }
        });
        System.out.println(sb);

    }



}
