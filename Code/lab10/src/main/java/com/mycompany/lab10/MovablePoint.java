/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab10;

/**
 *
 * @author taqua
 */
public class MovablePoint implements Movable{

    int x, y, xSpeed, ySpeed;
    
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
    
    @Override
    public String toString() {
        return "MovablePoint (" + this.x + ", " + this.y + ") have xSpeed = " + this.xSpeed + " and ySpeed = " + this.ySpeed;
    }
    
}
