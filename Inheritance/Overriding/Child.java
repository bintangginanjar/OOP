/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.overriding;

/**
 *
 * @author bintang
 */
public class Child extends Parent{
    private int number;    
    
    @Override
    public String toString() {
        return "this method is override by Child";
    }
    
    public String toStringParent() {
        return super.toString();
    }
    
    public void methodChild() {
        this.number = 10;
        super.number = 20;
        
        System.out.println("This is child number = " + this.number);
        System.out.println("This is parent number = " + super.number);
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setPrivateNum(int number) {
        
    }
}
