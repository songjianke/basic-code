package com.itheima.demo1;

import java.util.Scanner;

public class HuiWenShui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //初始化一个数字
        System.out.println("请输入一个整数");
        int i = sc.nextInt();

        int temp = i;

        int num = 0;
        while (temp != 0){
            //12345
            //取出个位
            int ge = temp % 10;
            //去掉个位
            temp = temp / 10; // 1234

            num = num * 10 + ge ;

        }

        if (num == i){
            System.out.println(i + "是一个回文数");
        }else{
            System.out.println(i + "不是一个回文数");
        }

    }
}
