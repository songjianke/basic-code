package com.itheima1;

public class GrilFriends {
    public static void main(String[] args) {
        GrilFriend[] g = new GrilFriend[4];

        GrilFriend grilFriend1 = new GrilFriend("张三", 18, "女", "打篮球");
        GrilFriend grilFriend2 = new GrilFriend("李四", 24, "女", "打篮球");
        GrilFriend grilFriend3 = new GrilFriend("王五", 32, "女", "打篮球");
        GrilFriend grilFriend4 = new GrilFriend("赵六", 40, "女", "打篮球");

        g[0] = grilFriend1;
        g[1] = grilFriend2;
        g[2] = grilFriend3;
        g[3] = grilFriend4;

        int sum = 0;

        for (int i = 0; i < g.length; i++) {
            GrilFriend grilFriend = g[i];

            sum = sum + grilFriend.getAge();

        }

        double avg = sum * 1.0 / g.length;

        System.out.println("平均年龄为：" + avg + "岁");

        for (int i = 0; i < g.length; i++) {
            GrilFriend grilFriend = g[i];

            int age = grilFriend.getAge();

            if (age >= avg) {

                System.out.println(grilFriend.getName() + " " + grilFriend.getAge() + " " + grilFriend.getGender() + " " + grilFriend.getHobby());
            }
        }

    }


}
