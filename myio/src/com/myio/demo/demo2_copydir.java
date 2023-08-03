package com.myio.demo;

import java.io.*;

public class demo2_copydir {
    public static void main(String[] args) throws IOException {

        File src = new File("F:\\黑马下载\\src");
        File dest = new File("F:\\黑马下载\\dest");

        copyDir(src, dest);


    }

    private static void copyDir(File src, File dest) throws IOException {

        dest.mkdirs();
        File[] files = src.listFiles();


        for (File file : files) {
            System.out.println(file);
            if (file.isFile()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(new File(dest, file.getName()));
                int rd;
                byte[] bytes = new byte[1024];
                while ((rd = fileInputStream.read(bytes)) != -1) {

                    fileOutputStream.write(bytes, 0, rd);

                }
                fileOutputStream.close();
                fileInputStream.close();

            } else {
                copyDir(file, new File(dest, file.getName()));

            }
        }


    }


}
