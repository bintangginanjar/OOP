/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.inheritance;

/**
 *
 * @author bintang
 */
public class Child extends Parent {
    private int childNum;
    private Parent myParent;
    
    public void methodChild() {
        System.out.println("This is method child");
    }
    
    public void setChildVariable() {
        publicParentInt = 10;
        //privateParentInt = 20;
        setPrivateParentInt(20);
        defaultParentInt = 30;
        protectedParentInt = 40;
    }
    
    /*
    public void setParentVariable() {
        super.publicParentInt = 100;        
        //privateParentInt = 200;
        setPrivateParentInt(200);
        super.defaultParentInt = 300;
        super.protectedParentInt = 400;
    }
    */
}
