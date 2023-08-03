package com.itheima1;

import java.util.Scanner;

public class CarTest {

    public static void main(String[] args) {

        car[] arr = new car[3];

        for (int i = 0; i < arr.length; i++) {

            Scanner sc = new Scanner(System.in);

            car car = new car();

            System.out.println("请输入汽车的品牌：");
            String bround = sc.next();
           car.setBround(bround);

            System.out.println("请输入汽车的价格：");
            double price = sc.nextDouble();
           car.setPrice(price);
            System.out.println("请输入汽车的颜色：");
            String color = sc.next();
            car.setColor(color);

            arr[i] = car;
        }


        for (int i = 0; i < arr.length; i++) {
            car car = arr[i];
            System.out.println(car.getBround());
        }
    }


}
