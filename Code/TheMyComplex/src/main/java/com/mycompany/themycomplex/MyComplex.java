/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.themycomplex;

/**
 *
 * @author taqua
 */
public class MyComplex {
    private double real;
    private double imag;
    
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    
    public double getReal() {
        return this.real;
    }
    
    public void setReal(double real) {
        this.real = real;
    }
    
    public double getImag() {
        return this.imag;
    }
    
    public void setImag(double imag) {
        this.imag = imag;
    }
    
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    
    @Override
    public String toString() {
        return "(" + this.real + " + " + this.imag + "i)";
    }
    
    public boolean isImaginary() {
        return (imag == 0);
    }
    
    public boolean equals(double real, double imag) {
        return (this.getReal() == real && this.getImag() == imag);
    }
    
    public boolean equals(MyComplex another) {
        return this.equals(another.getReal(), another.getImag());
    }
    
}