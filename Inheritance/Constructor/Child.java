/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.contructinherit;

/**
 *
 * @author bintang
 */
public class Child extends Parent {
    private int childInt;
    
    public Child(int pI) {
        super(pI);
        this.childInt = pI;
    }
    
    public Child(int pI, double pD) {
        super(pI, pD);        
        this.childInt = pI;        
    }

    public Child(double pD) {
        super(pD);
    }
    
    public String methodChild() {
        return "This is method child";
    }
    
    public int getChildInt() {
        return this.childInt;
    }
}
