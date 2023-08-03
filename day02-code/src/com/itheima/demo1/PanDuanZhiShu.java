package com.itheima.demo1;

import java.util.Scanner;

public class PanDuanZhiShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //判断质数（只能被1和本身整除的为质数）
        System.out.println("请输入一个整数");

        int i = sc.nextInt();
        boolean isZhiShu = true;

        for (int i1 = 2; i1 <= i; i1++) {
            if (i % i1 == 0 && i != i1){
                isZhiShu = false;
                break;
            }

        }

        if (isZhiShu){
            System.out.println(i + "是一个质数");
        }else{
            System.out.println(i + "不是一个质数");
        }

    }
}
