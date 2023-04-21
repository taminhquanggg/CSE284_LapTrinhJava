/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab10;

/**
 *
 * @author taqua
 */
public class MovableRectangle implements Movable{
    
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    
    @Override
    public void moveUp() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
    
    @Override
    public String toString() {
        return "MoveableRectangle with topLeft: " + this.topLeft + " and bottomRight: " + this.bottomRight;
    }
    
    
}
