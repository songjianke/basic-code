package com.puzzleGame.test;

import java.util.Random;

public class ArryTest {
    public static void main(String[] args) {


        int[] arrlist = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        Random random = new Random();
        for (int i = 0; i < arrlist.length; i++) {

            int randomIndex = random.nextInt(arrlist.length);

            int temp = arrlist[i];

            arrlist[i] = arrlist[randomIndex];

            arrlist[randomIndex] = temp;


        }
        for (int i = 0; i < arrlist.length; i++) {
            System.out.print(arrlist[i] + " ");
        }

        System.out.println();
        int[][] arr2 = new int[4][4];

        for (int i = 0; i < arrlist.length; i++) {
            arr2[i / 4][i % 4] = arrlist[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {

                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
