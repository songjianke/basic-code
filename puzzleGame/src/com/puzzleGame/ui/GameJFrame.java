package com.puzzleGame.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    //创建一个二维数组
    //目的：用来管理数据
    //加载图片的时候，会根据二维数组中的数据进行加载
    int[][] data = new int[4][4];
    //记录空白图片所在的位置
    int x = 0;
    int y = 0;
    String path = "puzzleGame\\image\\animal\\animal3\\";
    int step = 0;

    int[][] win = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };

    //创建选项下面的条目对象
    JMenuItem repalyJMenuItem = new JMenuItem("重新游戏");
    JMenuItem reloginJMenuItem = new JMenuItem("重新登陆");
    JMenuItem closeJMenuItem = new JMenuItem("关闭游戏");

    JMenuItem accountJMenuItem = new JMenuItem("公众号");

    //构造方法  都是需要初始化的
    public GameJFrame() {
        //初始化界面
        initJFram();
        //初始化菜单
        initJmenuBar();


        //初始化数值（打乱数组）
        initData();
        //初始化图片
        initImage();
        //让界面显示出来
        this.setVisible(true);
    }


    //初始化数据  打乱数据
    private void initData() {

        int[] arrlist = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //打乱arrlist数组
        Random random = new Random();
        for (int i = 0; i < arrlist.length; i++) {

            int randomIndex = random.nextInt(arrlist.length);

            int temp = arrlist[i];

            arrlist[i] = arrlist[randomIndex];

            arrlist[randomIndex] = temp;

        }
        //int[][] arr2 = new int[4][4];
        //遍历数组 将数值放入二维数组
        for (int i = 0; i < arrlist.length; i++) {
            //判断数值是否为0，如果为零记录坐标位置
            if (arrlist[i] == 0) {
                x = i / 4;//如果索引5为0   则 5 / 4 = 1
                y = i % 4;//5 % 4 = 1    则5索引的坐标为（1,1）
            }

            data[i / 4][i % 4] = arrlist[i];


        }

    }


    //初始化图片
    private void initImage() {

        //清空图片
        this.getContentPane().removeAll();

        if (victory()){
            ImageIcon imageIcon = new ImageIcon("puzzleGame\\image\\win.png");

            JLabel winJLabel = new JLabel(imageIcon);
            winJLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJLabel);


        }

        JLabel stepJLabel = new JLabel("步数：" + step);
        stepJLabel.setBounds(50,30,100,20);
        this.getContentPane().add(stepJLabel);


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number = data[i][j];
                //创建ImageIcon对象
                ImageIcon icon = new ImageIcon(path + number + ".jpg");
                //创建JLabel的对象
                JLabel jLabel = new JLabel(icon);
                //制定图片的位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                jLabel.setBorder(new BevelBorder(0));
                this.getContentPane().add(jLabel);

            }


        }

        ImageIcon imageIcon = new ImageIcon("puzzleGame\\image\\background.png");
        JLabel jLabel = new JLabel(imageIcon);
        jLabel.setBounds(40, 40, 508, 560);
        this.getContentPane().add(jLabel);
        //刷新图片
        this.getContentPane().repaint();
        //this.add(jLabel);

    }

    private void initJmenuBar() {
        //初始化菜单
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单上面的两个选项对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

/*        //创建选项下面的条目
        JMenuItem repalyJMenuItem = new JMenuItem("重新游戏");
        JMenuItem reloginJMenuItem = new JMenuItem("重新登陆");
        JMenuItem closeJMenuItem = new JMenuItem("关闭游戏");

        JMenuItem accountJMenuItem = new JMenuItem("公众号");*/



        //将条目添加到选项当中
        functionJMenu.add(repalyJMenuItem);
        functionJMenu.add(reloginJMenuItem);
        functionJMenu.add(closeJMenuItem);

        aboutJMenu.add(accountJMenuItem);

        //给条目绑定事件
        repalyJMenuItem.addActionListener(this);
        reloginJMenuItem.addActionListener(this);
        closeJMenuItem.addActionListener(this);
        accountJMenuItem.addActionListener(this);

        //将选项添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //将菜单添加到整个界面
        this.setJMenuBar(jMenuBar);
    }

    private void initJFram() {
        //设置界面的宽高
        this.setSize(603, 680);

        //设置标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode == 65) {
            this.getContentPane().removeAll();
            ImageIcon icon = new ImageIcon(path + "all.jpg");
            //创建JLabel的对象
            JLabel jLabel = new JLabel(icon);
            //制定图片的位置
            jLabel.setBounds(83, 134, 420, 420);
            this.getContentPane().add(jLabel);

            ImageIcon imageIcon = new ImageIcon("puzzleGame\\image\\background.png");
            JLabel jLabel1 = new JLabel(imageIcon);
            jLabel1.setBounds(40, 40, 508, 560);
            this.getContentPane().add(jLabel1);
            //刷新图片
            this.getContentPane().repaint();
            //this.add(jLabel);

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利，如果胜利此方法需要直接结束，不能执行下面的异动代码

        if (victory()){
            //return作用
//              1.返回结果
//              2.结束方法
//            因为方法没有返回值，所以return的作用是结束方法
            return;
        }


        int keyCode = e.getKeyCode();

        if (keyCode == 37) {

            System.out.println("向左移动");

            if (y == 3) {
                return;
            }

            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            //每移动一次，步数加一
            step++;
            initImage();
        } else if (keyCode == 38) {
            System.out.println("向上移动");

            if (x == 3) {
                return;
            }
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            //每移动一次，步数加一
            step++;
            initImage();
        } else if (keyCode == 39) {
            System.out.println("向右移动");

            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            //每移动一次，步数加一
            step++;
            initImage();
        } else if (keyCode == 40) {

            System.out.println("向下移动");

            if (x == 0) {
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            //每移动一次，步数加一
            step++;
            initImage();
        } else if (keyCode == 65) {
            initImage();
        }else if (keyCode == 87){
            data = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };

            initImage();
        }

    }

    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]){
                    //只要有一个不正确就返回FALSE
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == repalyJMenuItem){
            System.out.println("重新游戏");
            step = 0;
            initData();
            initImage();


        }else if(source == reloginJMenuItem){
            this.setVisible(false);
            new LogJFrame();
            System.out.println("重新登陆");
        }else if(source == closeJMenuItem){

            System.exit(0);
            System.out.println("关闭游戏");
        }else if(source == accountJMenuItem){
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            ImageIcon imageIcon = new ImageIcon("puzzleGame\\image\\about.png");
            //创建一个管理图片的容器对象
            JLabel jLabel = new JLabel(imageIcon);
            //设置位置和宽高
            jLabel.setBounds(0,0,258,258);
            //将图片放到弹框中
            jDialog.getContentPane().add(jLabel);
            //给弹框设置大小
            jDialog.setSize(344,344);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭就无法操作下面的界面
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);
            System.out.println("公众号");
        }
    }
}
