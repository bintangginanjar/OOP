/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.interfaceanimal;

/**
 *
 * @author bintang
 */
public class Whale extends Mammal {
    
    @Override
    public String whoAmI() {
        return "I'am a whale";
    }
    
    @Override
    public String move() {
        return "We move by swimming";
    }        
}