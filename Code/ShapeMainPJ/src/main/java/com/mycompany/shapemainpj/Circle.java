/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapemainpj;

/**
 *
 * @author taqua
 */
public class Circle extends Shape {
    protected double radius;
    
    public Circle() {}
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Radius: " + this.radius + ", Color: " + this.color + ", Filled: " + this.filled;
    }
}
