package com.itherma.demo;

import java.util.Random;

public class ArrayQiuHePinJunShu {
    public static void main(String[] args) {

        Random random = new Random();
        //动态创建一个数组
        int[] arr = new int[10];
        //遍历数组给数组赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
            System.out.println(arr[i]);
        }

        //求平均数
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }

        double avg = sum / arr.length;
        System.out.println(sum);
        System.out.println("arr数组平均数为"+ avg);
        int LessThanAvgCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg){
                LessThanAvgCount++;
            }
        }
        System.out.println("小于平均数的个数为："+LessThanAvgCount);
    }
}
