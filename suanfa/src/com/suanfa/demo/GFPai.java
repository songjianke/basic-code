package com.suanfa.demo;

import java.util.Arrays;
import java.util.Comparator;

public class GFPai {

    public static void main(String[] args) {

        GirlFriends girlFriends1 = new GirlFriends("a", 18, 1.68);
        GirlFriends girlFriends2 = new GirlFriends("aa",18,1.67);
        GirlFriends girlFriends3 = new GirlFriends("aaa",19,1.66);

        GirlFriends[] girlFriends = {girlFriends1,girlFriends2,girlFriends3};

        Arrays.sort(girlFriends, new Comparator<GirlFriends>() {
            @Override
            public int compare(GirlFriends o1, GirlFriends o2) {
                double temp = o1.getAge() - o2.getAge();

                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;

                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                if(temp > 0 ){
                    return 1;
                }else if (temp < 0 ){
                    return -1;
                }else {
                    return 0;
                }

            }
        });

        System.out.println(Arrays.toString(girlFriends));








    }

}
