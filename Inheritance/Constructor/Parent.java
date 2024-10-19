/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.contructinherit;

/**
 *
 * @author bintang
 */
public class Parent {
    protected int parentInt;
    protected double parentDouble;
    
    public Parent (int pI, double pD) {
        this.parentInt = pI;
        this.parentDouble = pD;
    }
    
    public Parent (int pI) {
        this.parentInt = pI;
    }
    
    public Parent (double pD) {
        this.parentDouble = pD;
    }
    
    public String methodParent() {
        return "This is method parent";
    }
}
