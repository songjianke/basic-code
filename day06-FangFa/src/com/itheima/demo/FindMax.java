package com.itheima.demo;

public class FindMax {

    public static void main(String[] args) {

        int[] arr = {99,22,33,44,55,66,77};
        System.out.println(findMaxInArr(arr));


        int maxInArr = findMaxInArr(arr);
        System.out.println(maxInArr);

    }

    public static int findMaxInArr(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max){
                max = arr[i];
            }

        }
        return max;
    }
}
