package com.fileTest.demo;

import java.io.File;

public class demo1 {

    public static void main(String[] args) {

        File file = new File("F:\\黑马下载\\java从入门到起飞\\java从入门到起飞\\day99-File练习");

        findAVI(file);


    }

    public static void findAVI(File src) {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file != null) {
                if (file.isFile()) {
                    file.delete();
                } else {
                    findAVI(file);
                }
            }
        }
        for (File file : files) {
            file.delete();
        }

    }
}
