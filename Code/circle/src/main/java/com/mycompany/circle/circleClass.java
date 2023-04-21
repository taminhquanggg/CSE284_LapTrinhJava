/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.circle;

/**
 *
 * @author taqua
 */
public class circleClass {
    private double radius;
    private String color;
    
    public circleClass() {
        radius = 0.1;
        color = "red";
    }
     
    public circleClass(double radius) {
        this.radius = radius;
        color = "red";
    }
    
    public circleClass(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea() {
        return radius*radius*Math.PI;
    }
    
    public String toString() {
        return "Circle: radius=" + radius + " color=" + color;
    }
    
}
