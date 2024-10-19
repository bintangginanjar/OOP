/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.finalparent;

/**
 *
 * @author bintang
 */
public class Parent {
    private int number;
    
    public String parentMethod() {
        return "This is parent method";
    }
    
    final public String myMethod() {
        return "This is my final method";
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }
}
