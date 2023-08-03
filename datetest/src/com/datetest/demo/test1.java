package com.datetest.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {

    public static void main(String[] args) throws ParseException {

        /*
        * 将 2020-01-01 转换为202年01月1日
        *
        * */


        String dt = "2020-01-01";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf1.parse(dt);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");

        String format1 = sdf2.format(parse);

        System.out.println(format1);


    }
}
