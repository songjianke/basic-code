package com.myStream.demo;

import java.util.ArrayList;
import java.util.Collections;

public class Yinyong {

    public static void main(String[] args) {

        String[] str = {"aaa","bbb","ccc","ddd","eee","fff","ggg"};
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,str);


        arrayList.stream().map(String::toUpperCase).forEach(s-> System.out.println(s));
    }
}
