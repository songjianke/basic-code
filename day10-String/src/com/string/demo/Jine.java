package com.string.demo;

import java.util.Scanner;

public class Jine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while (true) {
            System.out.println("请输入一个七位的数字");
            int moneyInt = sc.nextInt();
            if (moneyInt >= 0 && moneyInt <= 9999999) {
                //System.out.println(getCapital(moneyInt));

                String capital = getCapital(moneyInt);
                //System.out.println(replenishLing(capital));

                String s = replenishLing(capital);
                String s1 = BuChongDanWei(s);

                System.out.println(s1);

                break;
            } else {
                System.out.println("输入错误，请重新输入一个七位的数字");
            }


        }


    }

    public static String getCapital(int moneyInt) {
        String[] Capital = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖",};
        String result = "";

        while (true) {

            if (moneyInt == 0) {
                break;
            }

            //取出个位
            int ge = moneyInt % 10;
            //删除个位
            moneyInt = moneyInt / 10;

            result = Capital[ge] + result;

            //System.out.println(s);
        }

        return result;

    }


    public static String replenishLing(String moneyString) {

        int i = 7 - moneyString.length();

        String result = moneyString;
        for (int i1 = 0; i1 < i; i1++) {
            result = "零" + result;
        }

        return result;
    }


    public static String BuChongDanWei(String moneyString) {

        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String result = "";
        for (int i = 0; i < moneyString.length(); i++) {
            result = result + moneyString.charAt(i) + arr[i];
        }

        return result;
    }
}
