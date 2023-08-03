package com.string.demo;

public class overturn {
    public static void main(String[] args) {

        String s = "abcdefghigk";

        String overturn = overturn(s);

        System.out.println(overturn);
    }

    public static String overturn (String s){
        String result = "";

        for (int i = s.length() -1 ; i >= 0; i--) {

            result = result + s.charAt(i);

        }
        return result;

    }
}
