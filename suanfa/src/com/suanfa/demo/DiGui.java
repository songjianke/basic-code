package com.suanfa.demo;

public class DiGui {


    public static void main(String[] args) {

        System.out.println(jieChen(5));

    }



    public static int jieChen(int number){
        if(number == 1){
            return 1;
        }


        return number * jieChen(number - 1);

    }


}
