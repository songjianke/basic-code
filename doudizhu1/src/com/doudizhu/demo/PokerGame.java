package com.doudizhu.demo;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {

    static ArrayList<String> list = new ArrayList<>();

    static {


        String[] color = {"♥","♠","♦","♣"};
        String[] number = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};


        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < number.length; j++) {

                list.add(color[i] + number[j]);

            }
        }

        list.add("大王");
        list.add("小王");



    }

    public PokerGame() {

        //洗牌
        Collections.shuffle(list);

        //System.out.println(list);

        //发牌

        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);

            if (i <=2){
                lord.add(poker);
                continue;
            }

            if (i%3 == 0){
                player1.add(poker);

            }else if(i%3 == 1){
                player2.add(poker);

            }else {
                player3.add(poker);
            }
        }

        lookPoker("玩家1",player1);
        lookPoker("玩家2",player2);
        lookPoker("玩家3",player3);

    }

    public void lookPoker(String name,ArrayList<String> list){
        System.out.print(name + ": ");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

}
