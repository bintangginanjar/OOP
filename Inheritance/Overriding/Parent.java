/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.overriding;

/**
 *
 * @author bintang
 */
public class Parent {
    protected int number;
    private int privateNum;
    
    public String toString() {
        return "this is method parent";
    }
    
    public void setNumber(int parentNumber) {
        this.number = parentNumber;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setPrivateNum(int number) {
        privateNum = number;
    }
    
    public int getPrivateNum() {
        return privateNum;
    }
}
