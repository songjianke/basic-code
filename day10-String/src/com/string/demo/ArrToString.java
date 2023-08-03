package com.string.demo;

public class ArrToString {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6};

        String s = ArrToString(arr);

        System.out.println(s);

    }


    public static String ArrToString(int[] arr){
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length -1){
                result = result + arr[i] + ",";

            }else {
                result = result + arr[i] + "]";
            }

        }
        return result;
    }
}
