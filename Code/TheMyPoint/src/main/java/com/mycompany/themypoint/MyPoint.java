/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.themypoint;

/**
 *
 * @author taqua
 */
public class MyPoint {
    private int x = 0;
    private int y = 0;
    
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
    
    public double distance(int x, int y) {
        return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
    }
    
    public double distance(MyPoint another) {
        return (double)Math.sqrt((this.x - another.getX())*(this.x - another.getX()) + (this.y - another.getY())*(this.y - another.getY()));
    }
}
