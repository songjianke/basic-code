package com.suanfa.demo;

public class BuSiShenTu {
    public static void main(String[] args) {

        System.out.println(getSum(12));


    }
    //斐波那契数列  递归方式
    private static int getSum(int month) {
        if(month == 1 || month == 2){
            return 1;

        }else {
           return getSum(month - 1) + getSum(month - 2);
        }



    }


}
