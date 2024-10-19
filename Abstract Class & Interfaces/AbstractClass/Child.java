/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.abstractparent;

/**
 *
 * @author bintang
 */
public class Child extends Parent {
    
    @Override
    public String abstractMethod() {
        return "Children implementing abstract method pass down from parent";
    }
    
}
