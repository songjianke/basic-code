package com.itheima.demo;

import java.util.Random;

public class chouJiangYouHua {

    public static void main(String[] args) {
        //定义一个奖池
        int[] arr= {2,588,666,777,888,999,10000,1111111};

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int temp  = 0;
            int index = r.nextInt(arr.length);

            temp = arr[index];

            arr[index] = arr[i];

            arr[i] = temp;


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
