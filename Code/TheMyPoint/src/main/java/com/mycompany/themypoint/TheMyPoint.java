/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.themypoint;

/**
 *
 * @author taqua
 */
public class TheMyPoint {

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);
        
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance(p2));

        MyPoint[] points = new MyPoint[10];
        for (int i=0; i<10; i++) {
            points[i] = new MyPoint(i+1, i+1);
        }
        
        for (int i=0; i<10; i++) {
            System.out.println(points[i]);
        }
        
        MyCircle c1 = new MyCircle(2, 3, 5);
        System.out.println(c1);
        c1.setCenter(p1);
        System.out.println(c1);
        System.out.println(c1.getArea());
        
        MyTriangle t1 = new MyTriangle(0,0,0,1,2,0);
        MyTriangle t2 = new MyTriangle(new MyPoint(0, 0), new MyPoint(1,1), new MyPoint(-1, -1));
        
        System.out.println(t1);
        System.out.println(t1.getPerimeter());
        t1.PrintType();
        System.out.println(t2);
        System.out.println(t2.getPerimeter()); {
        t2.PrintType();
    }
    }
}
