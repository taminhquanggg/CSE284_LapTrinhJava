/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.circle;

/**
 *
 * @author taqua
 */
public class Circle {

    public static void main(String[] args) {
        circleClass c1 = new circleClass();
        System.out.println("The circle 1 has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        circleClass c2 = new circleClass(2.0);
        System.out.println("The circle 2 has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        c2.setColor("2.2");
        c2.setRadius(3);
        System.out.println(c2);
        circleClass c3 = new circleClass(5.0, "5.0");
        System.out.println(c3);
    }
}
