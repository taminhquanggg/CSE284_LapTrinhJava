/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab10;

/**
 *
 * @author taqua
 */
public class Lab10 {

    public static void main(String[] args) {
        Movable m1 = new MovablePoint(1, 2, 5, 5);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
        
        Movable m2 = new MovableRectangle(0, 0, 30, 30, 10, 10);
        System.out.println(m2);
        m2.moveLeft();
        System.out.println(m2);
        m2.moveUp();
        System.out.println(m2);


    }
}
