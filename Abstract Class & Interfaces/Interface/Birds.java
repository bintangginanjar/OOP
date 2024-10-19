/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.interfaceanimal;

/**
 *
 * @author bintang
 */
public class Birds extends Animal {
    protected String wings;
    protected String beak;
    
    @Override
    public String whoAmI() {
        return "This is kingdom birds";
    }
    
    @Override
    public String move() {
        return "We have various move";
    }
}
