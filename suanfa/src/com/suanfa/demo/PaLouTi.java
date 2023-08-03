package com.suanfa.demo;

public class Ti {
    public static void main(String[] args) {

        System.out.println(getSum(20));

    }

    private static int getSum(int i) {

        if(i== 1){
            return 1;
        }
        if(i == 2){
            return 2;
        }
        if(i == 3){
            return 4;
        }

        return  getSum(i - 1) + getSum(i - 2 ) + getSum(i - 3);
    }
}
