package com.arrList.demo;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {

        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("小米", 3000);
        Phone p2 = new Phone("华为", 6000);
        Phone p3 = new Phone("苹果", 2666);

        list.add(p1);
        list.add(p2);
        list.add(p3);


        ArrayList<Phone> phone = findPhone(list, 3000);

        for (int i = 0; i < phone.size(); i++) {
            System.out.println(phone.get(i).getBround() + "," + phone.get(i).getPrice());
        }

    }


    public static ArrayList<Phone> findPhone(ArrayList<Phone> list, int price) {
        ArrayList<Phone> findPhoneInPhone = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() <= price) {
                findPhoneInPhone.add(list.get(i));
            }
        }
        return findPhoneInPhone;
    }

}
