package com.itheima.demo1;

import java.util.Scanner;

public class SuanShuYunSuanFu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");

        int a = sc.nextInt();

        int ge = a % 10;
        int shi = a / 10 % 10;
        int bai = a / 100 % 10;

        System.out.println(a + "个位是："+ ge);
        System.out.println(a + "十位是："+ shi);
        System.out.println(a + "百位是："+ bai);


    }
}
