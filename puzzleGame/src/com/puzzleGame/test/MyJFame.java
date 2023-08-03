package com.puzzleGame.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFame extends JFrame implements ActionListener {

    JButton jbt1 = new JButton("jbt1");
    JButton jbt2 = new JButton("jbt2");
    public MyJFame(){

        this.setSize(603,680);

        this.setSize(603,680);

        this.setTitle("事件演示");

        this.setAlwaysOnTop(true);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setLayout(null);

        jbt1.setBounds(0,0,100,50);
        jbt2.setBounds(100,0,100,50);

        jbt1.addActionListener(this);
        jbt2.addActionListener(this);

        this.getContentPane().add(jbt1);
        this.getContentPane().add(jbt2);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        Random random = new Random();
        if (source == jbt1){
            jbt1.setSize(200,200);
        }else if(source == jbt2){

            jbt2.setLocation(random.nextInt(500),random.nextInt(500));
        }
    }
}
