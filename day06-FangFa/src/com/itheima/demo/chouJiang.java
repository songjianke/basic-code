package com.itheima.demo;

import java.util.Random;

public class chouJiang {
    public static void main(String[] args) {
        int[] arr = {2, 588, 8888, 18888, 299999};

        int[] newArr = new int[arr.length];

        Random r = new Random();


        for (int i1 = 0; i1 < arr.length; ) {
            int i = r.nextInt(arr.length);

            int price = arr[i];

            boolean flag = contains(newArr, price);

            if (!flag) {
                newArr[i1] = price;
                i1++;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

    }

    public static boolean contains(int[] newArr, int price) {
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == price) {
                return true;
            }
        }
        return false;
    }


}
