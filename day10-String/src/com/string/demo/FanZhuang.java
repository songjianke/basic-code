package com.string.demo;

public class FanZhuang {

    public static void main(String[] args) {

        String str1 = "abcdef";
        String str2 = "defabc";

        boolean chenk = chenk(str1, str2);

        System.out.println(chenk);


    }

    public static boolean chenk(String strA,String strB){

        for (int i = 0; i < strA.length(); i++) {

            strA  = rotate(strA);

            if (strA.equals(strB)){

                return true;
            }

        }
        return false;
    }


    public static String rotate(String str){
        char first = str.charAt(0);

        String sb = str.substring(1);

        return sb + first;

    }
}
