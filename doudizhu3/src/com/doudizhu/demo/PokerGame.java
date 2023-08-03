package com.doudizhu.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    static HashMap<Integer, String> poker = new HashMap<>();
    static ArrayList<Integer> index = new ArrayList<>();

    static {


        String[] color = {"♥","♠","♦","♣"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        int xuhao = 1;
        for (String n : number) {
            for (String c : color) {
                poker.put(xuhao,c+n);
                index.add(xuhao);
                xuhao++;
            }
        }

        poker.put(xuhao,"大王");
        index.add(xuhao);
        xuhao++;
        poker.put(xuhao,"小王");
        index.add(xuhao);
        System.out.println(poker);
        System.out.println(index);

    }



    public PokerGame(){

        //洗牌
        Collections.shuffle(index);

        System.out.println(index);
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        for (int i = 0; i < index.size(); i++) {
            Integer pokerIndex = index.get(i);
            if (i <= 2){
                lord.add(pokerIndex);
                continue;

            }
            if (i%3 == 0 ){
                player1.add(pokerIndex);
            }else if (i%3 == 1 ){
                player2.add(pokerIndex);
            }else {
                player3.add(pokerIndex);
            }



        }
//        System.out.println(player1);
//        System.out.println(player2);
//        System.out.println(player3);


        lookPoker("玩家1",player1);
        lookPoker("玩家2",player2);
        lookPoker("玩家3",player3);
    }


    public void lookPoker(String name,TreeSet<Integer> treeSet){

        System.out.print(name + ": ");

        for (Integer index : treeSet) {

            String s = poker.get(index);

            System.out.print(s + " ");

        }
        System.out.println();

    }

}
