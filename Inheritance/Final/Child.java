/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.finalparent;

/**
 *
 * @author bintang
 */
public class Child extends Parent {
    
    @Override
    public String parentMethod() {
        return "This parent method is override by Child";
    }
    
    /*
    @Override
    public String myMethod() {
        return "This method is forbidden to override";
    }
    */
}
