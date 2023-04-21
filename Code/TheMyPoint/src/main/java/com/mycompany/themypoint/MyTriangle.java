/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.themypoint;

/**
 *
 * @author taqua
 */
public class MyTriangle {
    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();
    
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
        v3.setXY(x3, y3);
    }
    
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    
    public String toString() {
        return "Triangle @ " + v1 + ", " + v2 + ", " + v3;
    }
    
    public double getPerimeter() {
       return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }
    
    public void PrintType() {
        if (v1.distance(v2) == v2.distance(v3) && v2.distance(v3) == v3.distance(v1)) {
            System.out.println("equilateral");
        }
        
        else if (v1.distance(v2) == v2.distance(v3) || v2.distance(v3) == v3.distance(v1) || v3.distance(v1) == v1.distance(v2)) {
            System.out.println("isosceles");   
        }
        else {
            System.out.println("scalene"); 
        }
    }
}
