package com.doudizhu.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PokerGame {
    static ArrayList<String> poker = new ArrayList<>();

    static HashMap<String, Integer> bz = new HashMap<>();




    static {
        String[] color = {"♥","♠","♦","♣"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        for (String n : number) {
            for (String c : color) {
                poker.add(c+n);

            }
        }
        poker.add(" 小王");
        poker.add(" 大王");


        bz.put("J",11);
        bz.put("Q",12);
        bz.put("K",13);
        bz.put("A",14);
        bz.put("2",15);
        bz.put("小王",50);
        bz.put("大王",100);

        System.out.println(poker);
    }

    public PokerGame(){

        //洗牌
        Collections.shuffle(poker);
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();


        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            if (i <=2){
                lord.add(s);
                continue;
            }

            if (i%3 == 0){
                player1.add(s);
            }else if (i%3 == 1){
                player2.add(s);
            }else{
                player3.add(s);
            }



        }

        sort(lord);
        sort(player1);
        sort(player2);
        sort(player3);


        System.out.println(lord);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

    }


    public void sort(ArrayList<String> list){
        Collections.sort(list, ( o1,  o2) ->{
                int i = getVelues(o1)-getVelues(o2);
                i = i==0 ? o1.substring(0, 1).compareTo(o2.substring(0, 1)):i;
                return i;

        });

    }

    public Integer getVelues(String key){

        String substring = key.substring(1);

        if (bz.containsKey(substring)){
            return bz.get(substring);
        }else {
            return Integer.parseInt(substring);
        }



    }
}
