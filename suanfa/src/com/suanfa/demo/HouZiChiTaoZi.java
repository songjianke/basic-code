package com.suanfa.demo;

public class HouZiChiTaoZi {


    public static void main(String[] args) {
        System.out.println(getStartCount(1));

    }

    private static int getStartCount(int i) {
        if (i == 10){
            return 1;
        }else{

            return (getStartCount(i+1) + 1) * 2 ;
        }


    }
}
