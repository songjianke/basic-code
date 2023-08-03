package com.itheima1;

public class GoodsTest {

    public static void main(String[] args) {

        Goods[] arr = new Goods[3];

        Goods g1 = new Goods("001", "手机", 1000, 5000);
        Goods g2 = new Goods("002", "电脑", 1000, 5000);
        Goods g3 = new Goods("003", "手表", 1000, 5000);


        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;


        for (int i = 0; i < arr.length; i++) {

            Goods goods = arr[i];

            System.out.println(goods.getId() + " " + goods.getName());


        }


    }


}
