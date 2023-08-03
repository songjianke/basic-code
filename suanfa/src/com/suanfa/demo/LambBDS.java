package com.suanfa.demo;

import java.util.Arrays;

public class LambBDS {

    public static void main(String[] args) {

        String[] arrayList = {"a", "aaaa", "aa", "aaa"};

        /*Arrays.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
*/

/*        Arrays.sort(arrayList,(String o1, String o2) ->{
                return o1.length() - o2.length();
            }
        );*/

        Arrays.sort(arrayList, (o1,o2)-> o1.length() - o2.length());

        System.out.println(Arrays.toString(arrayList));

    }








}
