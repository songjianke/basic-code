package com.itheima.demo;

import java.util.Random;
import java.util.Scanner;

public class shuangSeQiu {
    public static void main(String[] args) {

        int[] zhongJiangHaoMa = zhongJiangHaoMa();

        for (int i = 0; i < zhongJiangHaoMa.length; i++) {
            System.out.print(zhongJiangHaoMa[i] + " ");
        }
        System.out.println("");
        int[] userInputNumber = userInputNumber();

        for (int i = 0; i < userInputNumber.length; i++) {
            System.out.println(userInputNumber[i]);
        }

        int[] zhongJiang = isZhongJiang(zhongJiangHaoMa, userInputNumber);
        for (int i = 0; i < zhongJiang.length; i++) {
            System.out.print(zhongJiang[i]+ " ");
        }
    }

    //判断是否中奖

    public static int[] isZhongJiang(int[] zhongJiangHaoMa,int[] userInputNumber) {
        int[] arr = new int[2];
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < userInputNumber.length-1; i++) {

            for (int i1 = 0; i1 < zhongJiangHaoMa.length-1; i1++) {
                if (userInputNumber[i] == zhongJiangHaoMa[i]){
                    redCount++;
                    break;
                }
            }

        }
        if (userInputNumber[userInputNumber.length - 1] == zhongJiangHaoMa[zhongJiangHaoMa.length -1] ){
            blueCount++;
        }
        arr[0] = redCount;
        arr[1] = blueCount;
        return arr;
    }

    //用户输入号码
    public static int[] userInputNumber() {
        int[] userInputNumber = new int[7];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; ) {
            if (i <= 5) {
                System.out.println("请输入第" + (i + 1) + "个红球号码");

                int number = scanner.nextInt();
                boolean contains = contains(userInputNumber, number);
                if (number <= 33 && number >= 1) {
                    if (!contains) {
                        userInputNumber[i] = number;
                        i++;
                    } else {
                        System.out.println("当前数字已经存在，请重新输入");
                    }
                } else {
                    System.out.println("！！！非法数字，请重新输入");
                }

            } else {
                System.out.println("请输入蓝球号码");
                int i1 = scanner.nextInt();
                if (i1 <= 15 && i1 >= 1) {
                    userInputNumber[userInputNumber.length - 1] = i1;
                            i++;
                }else{
                    System.out.println("！！！非法数字，请重新输入");
                }

            }

        }
        return userInputNumber;

    }

    //生成中奖号码
    public static int[] zhongJiangHaoMa() {
        //中奖号码共7位
        int[] arr = new int[7];
        Random r = new Random();
        //生成前六位，前六位不能重复
        for (int i = 0; i < arr.length - 1; ) {

            int number = r.nextInt(33) + 1;
            boolean contains = contains(arr, number);
            if (!contains) {
                arr[i] = number;
                //只有成功添加的时候索引才会自增
                i++;
            }

        }

        int blueNumber = r.nextInt(15) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;

    }

    //判断前六位是否重复
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

}
