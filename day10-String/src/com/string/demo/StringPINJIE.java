package com.string.demo;

public class StringPINJIE {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < arr.length; i++) {

            if (i < arr.length - 1){
                sb.append(arr[i] + ",");
            }else {

                sb.append(arr[i] + "]");
            }
        }

        System.out.println(sb);

    }
}
