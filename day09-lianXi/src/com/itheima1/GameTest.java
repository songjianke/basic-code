package com.itheima1;

public class GameTest {

    public static void main(String[] args) {
        Role role1 = new Role("乔峰",100,"男");
        Role role2 = new Role("鸠摩智",100,"男");

        /* role1.setName("乔峰");
        role1.setBlood(100);
        role1.setName("鸠摩智");
        role1.setBlood(100);*/

        role1.showRoleInfo();
        role2.showRoleInfo();
        while (true) {
            role1.attack(role2);
            if (role2.getBlood() == 0) {
                System.out.println(role1.getName() + "KO了" + role2.getName());
                break;
            }

            role2.attack(role1);

            if (role1.getBlood() == 0) {
                System.out.println(role2.getName() + "KO了" + role1.getName());
                break;
            }

        }


    }
}
