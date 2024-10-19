/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.inheritance;

/**
 *
 * @author bintang
 */
public class Parent {
    public int publicParentInt;
    private int privateParentInt;    
    int defaultParentInt;
    protected int protectedParentInt;
    private double privateDouble;
    
    public void methodParent() {
        System.out.println("This is method parent");
    }
    
    public void setPrivateParentInt(int number) {
        this.privateParentInt = number;
    }
    
    public int getProtectedParentInt() {
        return protectedParentInt;
    }
    
    public int getPrivateParentInt() {
        return privateParentInt;
    }
}
