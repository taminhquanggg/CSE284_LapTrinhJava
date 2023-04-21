/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.demogui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author taqua
 */


public class DemoGUI extends Frame{

    DemoGUI() {
        this.setTitle("QLY HE THONG");
//        Label lbText = new Label("Tên tài khoản", Label.LEFT);
//        lbText.setForeground(Color.red);
//        lbText.setBackground(new Color(0, 160, 180));
//        lbText.setText("Username");
//        this.add(lbText);
//        this.setBounds(10, 10,300, 200);
        for (int i=0; i<10; i++) {
            JButton bt1;
            bt1 = new JButton();
            bt1.setLabel("Đăng nhập");
            bt1.setForeground(Color.ORANGE);
            bt1.setEnabled(true);
            this.add(bt1);
        }
        this.setLayout(new FlowLayout());
        this.setBounds(10,10,600,600);
        this.setVisible(true);


        this.setVisible(true);

    }

    public static void main(String[] args) {
        DemoGUI demoGUI = new DemoGUI();
        System.out.print("hello");
    }
}
