package com.itheima;

import java.util.Random;

public class Role {

    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getBlood() {
        return blood;
    }

    //定义一个方法用于攻击别人
    //思考：谁攻击谁？
    //方法调用者攻击参数
    //Role r1 = new Role();
    //Role r2 = new Role();
    //r1.attack(r2)
    public void attack(Role role) {
        //计算造成的伤害
        Random r = new Random();

        int hurt = r.nextInt(20) + 1;
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;

        role.setBlood(remainBlood);

        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，造成" +
                hurt + "点伤害，" + role.getName() + "还剩下" + remainBlood + "点血");


    }
}
