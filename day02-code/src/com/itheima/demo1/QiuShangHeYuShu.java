package com.itheima.demo1;

public class QiuShangHeYuShu {
    public static void main(String[] args) {
        //定义一个被除数
        int b = 1001;
        //定义一个除数
        int c = 10;
        //定义一个商
        int s = 0;
        //定义一个余数
        int y = 0;

        while (b >= c){
            b = b - c;
            s++;
            //System.out.println(b);
        }

        while (b > 0){
            b--;
            y++;
            //System.out.println(b);
        }

        System.out.println(s);
        System.out.println(y);
    }
}
